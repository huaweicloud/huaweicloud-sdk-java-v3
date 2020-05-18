package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 用户自定义键值对
 */
public class MetaData  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customize_key")
    
    private String customizeKey;

    public MetaData withCustomizeKey(String customizeKey) {
        this.customizeKey = customizeKey;
        return this;
    }

    


    /**
     * 用户自定义数据总长度不大于512字节。用户自定义键不能是空串，不能包含符号.，以及不能以符号$开头。说明：Windows弹性云服务器Administrator用户的密码。示例：键（固定）：admin_pass值：cloud.1234创建密码方式鉴权的Windows弹性云服务器时为必选字段。
     * @return customizeKey
     */
    public String getCustomizeKey() {
        return customizeKey;
    }

    public void setCustomizeKey(String customizeKey) {
        this.customizeKey = customizeKey;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetaData metaData = (MetaData) o;
        return Objects.equals(this.customizeKey, metaData.customizeKey);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customizeKey);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetaData {\n");
            sb.append("    customizeKey: ").append(toIndentedString(customizeKey)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

