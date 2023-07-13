/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson;

import com.huaweicloud.sdk.core.exception.SdkException;

import org.bson.BsonSerializationException;
import org.bson.io.BsonInput;
import org.bson.io.BsonInputMark;
import org.bson.types.ObjectId;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

import static java.lang.String.format;

/**
 * InputStreamBsonInput
 *
 * @since 2022-11-18
 */
public class InputStreamBsonInput implements BsonInput {
    private static int defaultBufferSize = 8192;
    private static final Charset UTF8_CHARSET = Charset.forName("UTF-8");
    private static final String[] ONE_BYTE_ASCII_STRINGS = new String[Byte.MAX_VALUE + 1];

    static {
        for (int b = 0; b < ONE_BYTE_ASCII_STRINGS.length; b++) {
            ONE_BYTE_ASCII_STRINGS[b] = String.valueOf((char) b);
        }
    }

    private BufferedInputStream buffer;
    private int pos = 0;
    private int mark = -1;

    InputStreamBsonInput(BufferedInputStream buffer) {
        this.buffer = buffer;
    }

    @Override
    public int getPosition() {
        return pos;
    }

    @Override
    public byte readByte() {
        byte[] bytes = new byte[1];
        ensureOpen();
        ensureReadSuccess(bytes, 0, 1);
        pos += 1;
        return bytes[0];
    }

    @Override
    public void readBytes(byte[] bytes) {
        ensureOpen();
        ensureReadSuccess(bytes, 0, bytes.length);
        pos += bytes.length;
    }

    @Override
    public void readBytes(byte[] bytes, int offset, int length) {
        ensureOpen();
        ensureReadSuccess(bytes, offset, length);
        pos += length;
    }

    @Override
    public long readInt64() {
        byte[] bytes = new byte[8];
        ensureOpen();
        ensureReadSuccess(bytes, 0, 8);
        pos += 8;
        ByteBuffer buf = ByteBuffer.wrap(bytes);
        buf.order(ByteOrder.LITTLE_ENDIAN);
        return buf.getLong();
    }

    @Override
    public double readDouble() {
        byte[] bytes = new byte[8];
        ensureOpen();
        ensureReadSuccess(bytes, 0, 8);
        pos += 8;
        ByteBuffer buf = ByteBuffer.wrap(bytes);
        buf.order(ByteOrder.LITTLE_ENDIAN);
        return buf.getDouble();
    }

    @Override
    public int readInt32() {
        byte[] bytes = new byte[4];
        ensureOpen();
        ensureReadSuccess(bytes, 0, 4);
        pos += 4;
        ByteBuffer buf = ByteBuffer.wrap(bytes);
        buf.order(ByteOrder.LITTLE_ENDIAN);
        return buf.getInt();
    }

    @Override
    public String readString() {
        ensureOpen();
        int size = readInt32();
        if (size <= 0) {
            throw new BsonSerializationException(format("While decoding a BSON string found a size that is not a " + "positive number: %d", size));
        }
        return readString(size);
    }

    @Override
    public ObjectId readObjectId() {
        byte[] bytes = new byte[12];
        readBytes(bytes);
        return new ObjectId(bytes);
    }

    @Override
    public String readCString() {
        ensureOpen();
        mark = pos;
        buffer.mark(defaultBufferSize);
        readUntilNullByte();
        int size = pos - mark;
        try {
            buffer.reset();
            pos = mark;
        } catch (IOException e) {
            throw new SdkException(e);
        }
        return readString(size);
    }

    @Override
    public void skipCString() {
        ensureOpen();
        readUntilNullByte();
    }

    @Override
    public void skip(int numBytes) {
        ensureOpen();
        try {
            long skipped = buffer.skip(numBytes);
            pos += skipped;
        } catch (IOException e) {
            throw new SdkException(e);
        }
    }

    /**
     * mark
     *
     * @param readLimit readLimit
     * @deprecated this method will be deprecated Possibly
     */
    @Deprecated
    public void mark(int readLimit) {
        ensureOpen();
        buffer.mark(readLimit);
        mark = pos;
    }

    @Override
    public BsonInputMark getMark(int readLimit) {
        buffer.mark(readLimit);
        mark = pos;
        return new BsonInputMark() {
            @Override
            public void reset() {
                ensureOpen();
                try {
                    buffer.reset();
                    pos = mark;
                } catch (IOException e) {
                    throw new SdkException(e);
                }
            }
        };
    }

    /**
     * reset
     *
     * @deprecated this method will be deprecated Possibly
     */
    @Deprecated
    public void reset() {
        try {
            ensureOpen(); // Cause exception if closed
            if (mark < 0) {
                throw new IOException("Resetting to invalid mark");
            }
            buffer.reset();
            pos = mark;
        } catch (IOException e) {
            throw new SdkException(e);
        }
    }

    @Override
    public boolean hasRemaining() {
        this.ensureOpen();
        try {
            return buffer.available() <= 0 ? false : true;
        } catch (IOException e) {
            throw new SdkException(e);
        }
    }

    @Override
    public void close() {
        try {
            buffer.close();
        } catch (IOException e) {
            throw new SdkException(e);
        }
    }

    private void ensureOpen() {
        if (buffer == null) {
            throw new IllegalStateException("Stream is closed");
        }
    }

    /**
     * InputStream数据来自网络，available方法无法获得准确的剩余字节数，
     * 所以使用循环读，直到读到完整的数据，或者socket关闭。
     */
    private void ensureReadSuccess(byte[] bytes, int offset, int len) {
        int r;
        int n = len;

        while (len > 0) {
            try {
                r = buffer.read(bytes, offset, len);
                if (r == -1) {
                    throw new BsonSerializationException(format("While decoding a BSON document %d bytes were required, " + "but only %d remain", n, n - len));
                }
                len -= r;
                offset += r;
                Thread.sleep(50);
            } catch (IOException | InterruptedException e) {
                throw new SdkException(e);
            }
        }
    }

    private String readString(final int size) {
        byte nullByte;
        if (size == 2) {
            byte asciiByte = readByte(); // if only one byte in the string, it must be ascii.
            nullByte = readByte(); // read null terminator
            if (nullByte != 0) {
                throw new BsonSerializationException("Found a BSON string that is not null-terminated");
            }
            if (asciiByte < 0) {
                return UTF8_CHARSET.newDecoder().replacement();
            }
            return ONE_BYTE_ASCII_STRINGS[asciiByte]; // this will throw if asciiByte is negative
        } else {
            byte[] bytes = new byte[size - 1];
            readBytes(bytes);
            nullByte = readByte();
            if (nullByte != 0) {
                throw new BsonSerializationException("Found a BSON string that is not null-terminated");
            }
            return new String(bytes, UTF8_CHARSET);
        }
    }

    private void readUntilNullByte() {
        // CHECKSTYLE:OFF
        while (readByte() != 0) { // NOPMD
            // do nothing - checkstyle & PMD hate this, not surprisingly
        }
        // CHECKSTYLE:ON
    }
}