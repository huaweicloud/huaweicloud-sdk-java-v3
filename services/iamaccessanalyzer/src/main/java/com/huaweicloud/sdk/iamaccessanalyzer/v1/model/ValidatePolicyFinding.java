package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ValidatePolicyFinding
 */
public class ValidatePolicyFinding {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finding_details")

    private String findingDetails;

    /**
     * 影响级别。 - security_warning 安全：策略存在安全风险，可能是允许访问的权限过于宽松等导致。 - error 错误：存在策略无法运行的错误，如语法错误、参数错误等。存在错误的情况下策略无法创建。 - warning 警告：存在策略无法运行的警告，如参数取值类型不匹配等。存在警告的情况下策略可以创建。 - suggestion 建议：不影响策略运行，但策略可能不能达到预期的效果。如存在空数组、空对象条件等。 
     */
    public static final class FindingTypeEnum {

        /**
         * Enum SECURITY_WARNING for value: "security_warning"
         */
        public static final FindingTypeEnum SECURITY_WARNING = new FindingTypeEnum("security_warning");

        /**
         * Enum ERROR for value: "error"
         */
        public static final FindingTypeEnum ERROR = new FindingTypeEnum("error");

        /**
         * Enum WARNING for value: "warning"
         */
        public static final FindingTypeEnum WARNING = new FindingTypeEnum("warning");

        /**
         * Enum SUGGESTION for value: "suggestion"
         */
        public static final FindingTypeEnum SUGGESTION = new FindingTypeEnum("suggestion");

        private static final Map<String, FindingTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FindingTypeEnum> createStaticFields() {
            Map<String, FindingTypeEnum> map = new HashMap<>();
            map.put("security_warning", SECURITY_WARNING);
            map.put("error", ERROR);
            map.put("warning", WARNING);
            map.put("suggestion", SUGGESTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FindingTypeEnum(String value) {
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
        public static FindingTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FindingTypeEnum(value));
        }

        public static FindingTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FindingTypeEnum) {
                return this.value.equals(((FindingTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finding_type")

    private FindingTypeEnum findingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_code")

    private String issueCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "learn_more_link")

    private String learnMoreLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locations")

    private List<Location> locations = null;

    public ValidatePolicyFinding withFindingDetails(String findingDetails) {
        this.findingDetails = findingDetails;
        return this;
    }

    /**
     * 一条本地化消息提供了如何解决该问题的指导。
     * @return findingDetails
     */
    public String getFindingDetails() {
        return findingDetails;
    }

    public void setFindingDetails(String findingDetails) {
        this.findingDetails = findingDetails;
    }

    public ValidatePolicyFinding withFindingType(FindingTypeEnum findingType) {
        this.findingType = findingType;
        return this;
    }

    /**
     * 影响级别。 - security_warning 安全：策略存在安全风险，可能是允许访问的权限过于宽松等导致。 - error 错误：存在策略无法运行的错误，如语法错误、参数错误等。存在错误的情况下策略无法创建。 - warning 警告：存在策略无法运行的警告，如参数取值类型不匹配等。存在警告的情况下策略可以创建。 - suggestion 建议：不影响策略运行，但策略可能不能达到预期的效果。如存在空数组、空对象条件等。 
     * @return findingType
     */
    public FindingTypeEnum getFindingType() {
        return findingType;
    }

    public void setFindingType(FindingTypeEnum findingType) {
        this.findingType = findingType;
    }

    public ValidatePolicyFinding withIssueCode(String issueCode) {
        this.issueCode = issueCode;
        return this;
    }

    /**
     * 问题码提供了与此校验结果关联的问题的标识符。
     * @return issueCode
     */
    public String getIssueCode() {
        return issueCode;
    }

    public void setIssueCode(String issueCode) {
        this.issueCode = issueCode;
    }

    public ValidatePolicyFinding withLearnMoreLink(String learnMoreLink) {
        this.learnMoreLink = learnMoreLink;
        return this;
    }

    /**
     * 指向与此校验结果关联的相关文档的链接。
     * @return learnMoreLink
     */
    public String getLearnMoreLink() {
        return learnMoreLink;
    }

    public void setLearnMoreLink(String learnMoreLink) {
        this.learnMoreLink = learnMoreLink;
    }

    public ValidatePolicyFinding withLocations(List<Location> locations) {
        this.locations = locations;
        return this;
    }

    public ValidatePolicyFinding addLocationsItem(Location locationsItem) {
        if (this.locations == null) {
            this.locations = new ArrayList<>();
        }
        this.locations.add(locationsItem);
        return this;
    }

    public ValidatePolicyFinding withLocations(Consumer<List<Location>> locationsSetter) {
        if (this.locations == null) {
            this.locations = new ArrayList<>();
        }
        locationsSetter.accept(this.locations);
        return this;
    }

    /**
     * 策略文档中与校验结果相关的位置列表。
     * @return locations
     */
    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValidatePolicyFinding that = (ValidatePolicyFinding) obj;
        return Objects.equals(this.findingDetails, that.findingDetails)
            && Objects.equals(this.findingType, that.findingType) && Objects.equals(this.issueCode, that.issueCode)
            && Objects.equals(this.learnMoreLink, that.learnMoreLink) && Objects.equals(this.locations, that.locations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(findingDetails, findingType, issueCode, learnMoreLink, locations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidatePolicyFinding {\n");
        sb.append("    findingDetails: ").append(toIndentedString(findingDetails)).append("\n");
        sb.append("    findingType: ").append(toIndentedString(findingType)).append("\n");
        sb.append("    issueCode: ").append(toIndentedString(issueCode)).append("\n");
        sb.append("    learnMoreLink: ").append(toIndentedString(learnMoreLink)).append("\n");
        sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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
