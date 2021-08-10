package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Request Object */
public class ShowApiVersionRequest {

    /** API版本ID。 */
    public static final class ApiVersionEnum {

        /** Enum V1 for value: "v1" */
        public static final ApiVersionEnum V1 = new ApiVersionEnum("v1");

        /** Enum V2 for value: "v2" */
        public static final ApiVersionEnum V2 = new ApiVersionEnum("v2");

        private static final Map<String, ApiVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApiVersionEnum> createStaticFields() {
            Map<String, ApiVersionEnum> map = new HashMap<>();
            map.put("v1", V1);
            map.put("v2", V2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApiVersionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ApiVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ApiVersionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ApiVersionEnum(value);
            }
            return result;
        }

        public static ApiVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ApiVersionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApiVersionEnum) {
                return this.value.equals(((ApiVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_version")

    private ApiVersionEnum apiVersion;

    public ShowApiVersionRequest withApiVersion(ApiVersionEnum apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /** API版本ID。
     * 
     * @return apiVersion */
    public ApiVersionEnum getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(ApiVersionEnum apiVersion) {
        this.apiVersion = apiVersion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowApiVersionRequest showApiVersionRequest = (ShowApiVersionRequest) o;
        return Objects.equals(this.apiVersion, showApiVersionRequest.apiVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowApiVersionRequest {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
