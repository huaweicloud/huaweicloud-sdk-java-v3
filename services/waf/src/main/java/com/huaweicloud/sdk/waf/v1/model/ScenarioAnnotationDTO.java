package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 场景标注（标识登录/注册接口及其参数与响应语义）
 */
public class ScenarioAnnotationDTO {

    /**
     * 场景类型（LOGIN/REGISTER/CUSTOM）
     */
    public static final class ScenarioTypeEnum {

        /**
         * Enum LOGIN for value: "LOGIN"
         */
        public static final ScenarioTypeEnum LOGIN = new ScenarioTypeEnum("LOGIN");

        /**
         * Enum REGISTER for value: "REGISTER"
         */
        public static final ScenarioTypeEnum REGISTER = new ScenarioTypeEnum("REGISTER");

        /**
         * Enum CUSTOM for value: "CUSTOM"
         */
        public static final ScenarioTypeEnum CUSTOM = new ScenarioTypeEnum("CUSTOM");

        private static final Map<String, ScenarioTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScenarioTypeEnum> createStaticFields() {
            Map<String, ScenarioTypeEnum> map = new HashMap<>();
            map.put("LOGIN", LOGIN);
            map.put("REGISTER", REGISTER);
            map.put("CUSTOM", CUSTOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScenarioTypeEnum(String value) {
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
        public static ScenarioTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScenarioTypeEnum(value));
        }

        public static ScenarioTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScenarioTypeEnum) {
                return this.value.equals(((ScenarioTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scenario_type")

    private ScenarioTypeEnum scenarioType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_match")

    private UrlMatchDTO urlMatch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_inspection")

    private RequestInspectionDTO requestInspection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_inspection")

    private ResponseInspectionDTO responseInspection;

    public ScenarioAnnotationDTO withScenarioType(ScenarioTypeEnum scenarioType) {
        this.scenarioType = scenarioType;
        return this;
    }

    /**
     * 场景类型（LOGIN/REGISTER/CUSTOM）
     * @return scenarioType
     */
    public ScenarioTypeEnum getScenarioType() {
        return scenarioType;
    }

    public void setScenarioType(ScenarioTypeEnum scenarioType) {
        this.scenarioType = scenarioType;
    }

    public ScenarioAnnotationDTO withUrlMatch(UrlMatchDTO urlMatch) {
        this.urlMatch = urlMatch;
        return this;
    }

    public ScenarioAnnotationDTO withUrlMatch(Consumer<UrlMatchDTO> urlMatchSetter) {
        if (this.urlMatch == null) {
            this.urlMatch = new UrlMatchDTO();
            urlMatchSetter.accept(this.urlMatch);
        }

        return this;
    }

    /**
     * Get urlMatch
     * @return urlMatch
     */
    public UrlMatchDTO getUrlMatch() {
        return urlMatch;
    }

    public void setUrlMatch(UrlMatchDTO urlMatch) {
        this.urlMatch = urlMatch;
    }

    public ScenarioAnnotationDTO withRequestInspection(RequestInspectionDTO requestInspection) {
        this.requestInspection = requestInspection;
        return this;
    }

    public ScenarioAnnotationDTO withRequestInspection(Consumer<RequestInspectionDTO> requestInspectionSetter) {
        if (this.requestInspection == null) {
            this.requestInspection = new RequestInspectionDTO();
            requestInspectionSetter.accept(this.requestInspection);
        }

        return this;
    }

    /**
     * Get requestInspection
     * @return requestInspection
     */
    public RequestInspectionDTO getRequestInspection() {
        return requestInspection;
    }

    public void setRequestInspection(RequestInspectionDTO requestInspection) {
        this.requestInspection = requestInspection;
    }

    public ScenarioAnnotationDTO withResponseInspection(ResponseInspectionDTO responseInspection) {
        this.responseInspection = responseInspection;
        return this;
    }

    public ScenarioAnnotationDTO withResponseInspection(Consumer<ResponseInspectionDTO> responseInspectionSetter) {
        if (this.responseInspection == null) {
            this.responseInspection = new ResponseInspectionDTO();
            responseInspectionSetter.accept(this.responseInspection);
        }

        return this;
    }

    /**
     * Get responseInspection
     * @return responseInspection
     */
    public ResponseInspectionDTO getResponseInspection() {
        return responseInspection;
    }

    public void setResponseInspection(ResponseInspectionDTO responseInspection) {
        this.responseInspection = responseInspection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScenarioAnnotationDTO that = (ScenarioAnnotationDTO) obj;
        return Objects.equals(this.scenarioType, that.scenarioType) && Objects.equals(this.urlMatch, that.urlMatch)
            && Objects.equals(this.requestInspection, that.requestInspection)
            && Objects.equals(this.responseInspection, that.responseInspection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scenarioType, urlMatch, requestInspection, responseInspection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScenarioAnnotationDTO {\n");
        sb.append("    scenarioType: ").append(toIndentedString(scenarioType)).append("\n");
        sb.append("    urlMatch: ").append(toIndentedString(urlMatch)).append("\n");
        sb.append("    requestInspection: ").append(toIndentedString(requestInspection)).append("\n");
        sb.append("    responseInspection: ").append(toIndentedString(responseInspection)).append("\n");
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
