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
 * 可用于改进策略的可操作建议。
 */
public class ValidatePolicyFinding {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finding_details")

    private String findingDetails;

    /**
     * 影响级别。  安全警告：策略允许的范围过大。  错误：策略不符合策略语法规则。  警告：非安全问题，策略不符合策略编写最佳实践。  建议：改进策略，不影响访问范围。 
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
     * 影响级别。  安全警告：策略允许的范围过大。  错误：策略不符合策略语法规则。  警告：非安全问题，策略不符合策略编写最佳实践。  建议：改进策略，不影响访问范围。 
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
     * 问题码提供了与此查找结果关联的问题的标识符。
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
     * 指向与此查找结果关联的相关文档的链接。
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
     * 策略文档中与查找结果相关的位置列表。
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
