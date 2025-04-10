package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * 文件类型，包含如下:   - 0 ：全部   - 1 : 可执行   - 2 : 压缩   - 3 : 脚本   - 4 : 文档   - 5 : 图片   - 6 : 音视频
 */
public class FileType {

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileType {\n");
        sb.append("}");
        return sb.toString();
    }

}
