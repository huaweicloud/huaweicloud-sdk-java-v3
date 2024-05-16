package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class RestartStarrocksInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "starrocks_instance_id")

    private String starrocksInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    public RestartStarrocksInstanceRequest withStarrocksInstanceId(String starrocksInstanceId) {
        this.starrocksInstanceId = starrocksInstanceId;
        return this;
    }

    /**
     * StarRocks实例ID，严格匹配UUID规则。
     * @return starrocksInstanceId
     */
    public String getStarrocksInstanceId() {
        return starrocksInstanceId;
    }

    public void setStarrocksInstanceId(String starrocksInstanceId) {
        this.starrocksInstanceId = starrocksInstanceId;
    }

    public RestartStarrocksInstanceRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 请求语言类型。默认en-us。 取值范围： - en-us - zh-cn
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestartStarrocksInstanceRequest that = (RestartStarrocksInstanceRequest) obj;
        return Objects.equals(this.starrocksInstanceId, that.starrocksInstanceId)
            && Objects.equals(this.xLanguage, that.xLanguage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(starrocksInstanceId, xLanguage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestartStarrocksInstanceRequest {\n");
        sb.append("    starrocksInstanceId: ").append(toIndentedString(starrocksInstanceId)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
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
