/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson;

import com.huaweicloud.sdk.corebson.model.BasicRequest;
import com.huaweicloud.sdk.corebson.model.BasicResponse;
import com.huaweicloud.sdk.corebson.model.ArrayRequest;
import com.huaweicloud.sdk.corebson.model.ArrayResponse;
import com.huaweicloud.sdk.corebson.model.ArrayRequestBody;
import com.huaweicloud.sdk.corebson.model.TimeRequest;
import com.huaweicloud.sdk.corebson.model.TimeRequestBody;
import com.huaweicloud.sdk.corebson.model.TimeResponse;
import com.huaweicloud.sdk.corebson.model.BasicRequestBody;
import com.huaweicloud.sdk.corebson.model.BasicType;
import com.huaweicloud.sdk.corebson.model.DocumentRequest;
import com.huaweicloud.sdk.corebson.model.DocumentRequestBody;
import com.huaweicloud.sdk.corebson.model.DocumentResponse;
import com.huaweicloud.sdk.corebson.model.BigObjectRequest;
import com.huaweicloud.sdk.corebson.model.BigObjectRequestBody;
import com.huaweicloud.sdk.corebson.model.BigObjectResponse;
import com.huaweicloud.sdk.corebson.model.CreateTableRequest;
import com.huaweicloud.sdk.corebson.model.CreateTableRequestBody;
import com.huaweicloud.sdk.corebson.model.PrimaryKeySchema;
import com.huaweicloud.sdk.corebson.model.CreateTableResponse;
import com.huaweicloud.sdk.corebson.model.KeySchema;
import com.huaweicloud.sdk.corebson.model.ShardKeyFieldName;

import org.bson.BsonJavaScript;
import org.bson.BsonRegularExpression;
import org.bson.types.MaxKey;
import org.bson.types.MinKey;
import org.bson.types.ObjectId;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class TestBsonInput {
    @Test
    public void testBasic() throws IOException {
        byte byteValue = (byte) 12;
        int intValue = 123;
        long longValue = 1234556789L;
        double doubleValue = 123.456789D;
        BigDecimal bigDecimal = new BigDecimal(Double.toString(123.11111111));
        boolean bool = true;
        String str = "test";
        // encode
        BasicRequest request = new BasicRequest().withBody(new BasicRequestBody(byteValue, bool, intValue, longValue, doubleValue, bigDecimal, str));
        try (InputStream output = request.extractBody()) {
            // decode
            BasicResponse response = new BasicResponse();
            BasicResponse res = (BasicResponse) response.getBodyFromInputStream(output);
            Assert.assertEquals(res.getByteValue(), byteValue);
            Assert.assertEquals(res.getBoolValue(), bool);
            Assert.assertEquals(res.getDoubleValue(), doubleValue, 0.000001);
            Assert.assertEquals(res.getStringValue(), str);
            Assert.assertEquals(res.getIntValue(), intValue);
            Assert.assertEquals(res.getLongValue(), longValue);
            Assert.assertEquals(res.getBigDecimalValue(), bigDecimal);
        }
    }

    @Test
    public void testArray() throws IOException {
        List<String> strArray = new ArrayList<String>();
        strArray.add("string1");
        strArray.add("string2");
        // encode
        ArrayRequest request = new ArrayRequest().withBody(new ArrayRequestBody(strArray));
        try (InputStream output = request.extractBody()) {
            // decode
            ArrayResponse response = new ArrayResponse();
            ArrayResponse res = (ArrayResponse) response.getBodyFromInputStream(output);
            Assert.assertEquals(res.getStrArray(), strArray);
        }
    }

    @Test
    public void testTime() throws IOException {
        OffsetDateTime time = OffsetDateTime.now();
        // encode
        TimeRequest request = new TimeRequest().withBody(new TimeRequestBody(time));
        try (InputStream output = request.extractBody()) {
            // decode
            TimeResponse response = new TimeResponse();
            TimeResponse res = (TimeResponse) response.getBodyFromInputStream(output);
            // 纳秒清零，因为序列化仅支持到毫秒精度
            Assert.assertEquals(res.getTime(), time.withNano((time.getNano() / 1000000) * 1000000));
        }
    }

    @Test
    public void testDocument() throws IOException {
        byte byteValue = (byte) 12;
        boolean boolValue = true;
        int intValue = 123;
        long longValue = 1234556789L;
        double doubleValue = 123.456789D;
        BigDecimal bigDecimal = new BigDecimal(Double.toString(123.11111111));
        String str = "test";
        BasicType doc = new BasicType(byteValue, boolValue, intValue, longValue, doubleValue, bigDecimal, str);
        // encode
        DocumentRequest request = new DocumentRequest().withBody(new DocumentRequestBody(doc));
        try (InputStream output = request.extractBody()) {
            // decode
            DocumentResponse response = new DocumentResponse();
            DocumentResponse res = (DocumentResponse) response.getBodyFromInputStream(output);

            Assert.assertEquals(res.getDoc(), doc);
        }
    }

    @Test
    public void testBigObject() throws IOException {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 1024 * 1024; i++) {
            s.append('a' + "");
        }
        String str = s.toString();
        // encode
        BigObjectRequest request = new BigObjectRequest().withbody(new BigObjectRequestBody(str));
        try (InputStream output = request.extractBody()) {
            // decode
            BigObjectResponse response = new BigObjectResponse();
            BigObjectResponse res = (BigObjectResponse) response.getBodyFromInputStream(output);

            Assert.assertEquals(res.getBigStr(), str);
        }
    }

    @Test
    public void testPrivateType() throws IOException {
        // encode
        CreateTableRequest request = new CreateTableRequest().withBody(new CreateTableRequestBody().withTableName("course").withPrimaryKeySchema(new PrimaryKeySchema().withKeySchema(new KeySchema().withShardKeyFieldName(new ShardKeyFieldName().withByteValue((byte) 12).withJscodeValue(new BsonJavaScript("1234")).withObjectidValue(new ObjectId()).withMaxkeyValue(new MaxKey()).withMinkeyValue(new MinKey()).withTimestampValue(new Timestamp(System.currentTimeMillis())).withRegexValue(new BsonRegularExpression("a*b", "w"))))));
        try (InputStream output = request.extractBody()) {
            // decode
            CreateTableResponse response = new CreateTableResponse();
            CreateTableRequestBody resBody = (CreateTableRequestBody) response.getBodyFromInputStream(output);

            Assert.assertEquals(request.getBody(), resBody);
        }
    }
}

