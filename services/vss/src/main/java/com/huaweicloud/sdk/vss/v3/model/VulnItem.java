package com.huaweicloud.sdk.vss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** VulnItem */
public class VulnItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vuln_id")

    private String vulnId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    /** 漏洞风险等级: * high - 高风险 * middle - 中风险 * low - 低风险 * hint - 提示 */
    public static final class SeverityEnum {

        /** Enum HIGH for value: "high" */
        public static final SeverityEnum HIGH = new SeverityEnum("high");

        /** Enum MIDDLE for value: "middle" */
        public static final SeverityEnum MIDDLE = new SeverityEnum("middle");

        /** Enum LOW for value: "low" */
        public static final SeverityEnum LOW = new SeverityEnum("low");

        /** Enum HINT for value: "hint" */
        public static final SeverityEnum HINT = new SeverityEnum("hint");

        private static final Map<String, SeverityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SeverityEnum> createStaticFields() {
            Map<String, SeverityEnum> map = new HashMap<>();
            map.put("high", HIGH);
            map.put("middle", MIDDLE);
            map.put("low", LOW);
            map.put("hint", HINT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SeverityEnum(String value) {
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
        public static SeverityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SeverityEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SeverityEnum(value);
            }
            return result;
        }

        public static SeverityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SeverityEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SeverityEnum) {
                return this.value.equals(((SeverityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private SeverityEnum severity;

    /** 漏洞状态: * repairing - 未修复 * repaired - 已修复 * false_report - 误报，已忽略 */
    public static final class VulnStatusEnum {

        /** Enum REPAIRING for value: "repairing" */
        public static final VulnStatusEnum REPAIRING = new VulnStatusEnum("repairing");

        /** Enum REPAIRED for value: "repaired" */
        public static final VulnStatusEnum REPAIRED = new VulnStatusEnum("repaired");

        /** Enum FALSE_REPORT for value: "false_report" */
        public static final VulnStatusEnum FALSE_REPORT = new VulnStatusEnum("false_report");

        private static final Map<String, VulnStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VulnStatusEnum> createStaticFields() {
            Map<String, VulnStatusEnum> map = new HashMap<>();
            map.put("repairing", REPAIRING);
            map.put("repaired", REPAIRED);
            map.put("false_report", FALSE_REPORT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VulnStatusEnum(String value) {
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
        public static VulnStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            VulnStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VulnStatusEnum(value);
            }
            return result;
        }

        public static VulnStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            VulnStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VulnStatusEnum) {
                return this.value.equals(((VulnStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vuln_status")

    private VulnStatusEnum vulnStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vuln_class")

    private String vulnClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vuln_type")

    private String vulnType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advice")

    private String advice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hit_details")

    private String hitDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request")

    private String request;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response")

    private String response;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "find_time")

    private String findTime;

    public VulnItem withVulnId(String vulnId) {
        this.vulnId = vulnId;
        return this;
    }

    /** 漏洞ID
     * 
     * @return vulnId */
    public String getVulnId() {
        return vulnId;
    }

    public void setVulnId(String vulnId) {
        this.vulnId = vulnId;
    }

    public VulnItem withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /** 域名ID
     * 
     * @return domainId */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public VulnItem withUrl(String url) {
        this.url = url;
        return this;
    }

    /** 目标网址
     * 
     * @return url */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public VulnItem withSeverity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /** 漏洞风险等级: * high - 高风险 * middle - 中风险 * low - 低风险 * hint - 提示
     * 
     * @return severity */
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public VulnItem withVulnStatus(VulnStatusEnum vulnStatus) {
        this.vulnStatus = vulnStatus;
        return this;
    }

    /** 漏洞状态: * repairing - 未修复 * repaired - 已修复 * false_report - 误报，已忽略
     * 
     * @return vulnStatus */
    public VulnStatusEnum getVulnStatus() {
        return vulnStatus;
    }

    public void setVulnStatus(VulnStatusEnum vulnStatus) {
        this.vulnStatus = vulnStatus;
    }

    public VulnItem withVulnClass(String vulnClass) {
        this.vulnClass = vulnClass;
        return this;
    }

    /** 漏洞类别
     * 
     * @return vulnClass */
    public String getVulnClass() {
        return vulnClass;
    }

    public void setVulnClass(String vulnClass) {
        this.vulnClass = vulnClass;
    }

    public VulnItem withVulnType(String vulnType) {
        this.vulnType = vulnType;
        return this;
    }

    /** 漏洞名称
     * 
     * @return vulnType */
    public String getVulnType() {
        return vulnType;
    }

    public void setVulnType(String vulnType) {
        this.vulnType = vulnType;
    }

    public VulnItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 漏洞描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VulnItem withAdvice(String advice) {
        this.advice = advice;
        return this;
    }

    /** 修复建议
     * 
     * @return advice */
    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public VulnItem withHitDetails(String hitDetails) {
        this.hitDetails = hitDetails;
        return this;
    }

    /** 命中详情
     * 
     * @return hitDetails */
    public String getHitDetails() {
        return hitDetails;
    }

    public void setHitDetails(String hitDetails) {
        this.hitDetails = hitDetails;
    }

    public VulnItem withRequest(String request) {
        this.request = request;
        return this;
    }

    /** 请求详情
     * 
     * @return request */
    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public VulnItem withResponse(String response) {
        this.response = response;
        return this;
    }

    /** 响应详情
     * 
     * @return response */
    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public VulnItem withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /** 漏洞确认人
     * 
     * @return provider */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public VulnItem withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /** 漏洞忽略理由
     * 
     * @return reason */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public VulnItem withFindTime(String findTime) {
        this.findTime = findTime;
        return this;
    }

    /** 漏洞发现时间
     * 
     * @return findTime */
    public String getFindTime() {
        return findTime;
    }

    public void setFindTime(String findTime) {
        this.findTime = findTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VulnItem vulnItem = (VulnItem) o;
        return Objects.equals(this.vulnId, vulnItem.vulnId) && Objects.equals(this.domainId, vulnItem.domainId)
            && Objects.equals(this.url, vulnItem.url) && Objects.equals(this.severity, vulnItem.severity)
            && Objects.equals(this.vulnStatus, vulnItem.vulnStatus)
            && Objects.equals(this.vulnClass, vulnItem.vulnClass) && Objects.equals(this.vulnType, vulnItem.vulnType)
            && Objects.equals(this.description, vulnItem.description) && Objects.equals(this.advice, vulnItem.advice)
            && Objects.equals(this.hitDetails, vulnItem.hitDetails) && Objects.equals(this.request, vulnItem.request)
            && Objects.equals(this.response, vulnItem.response) && Objects.equals(this.provider, vulnItem.provider)
            && Objects.equals(this.reason, vulnItem.reason) && Objects.equals(this.findTime, vulnItem.findTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulnId,
            domainId,
            url,
            severity,
            vulnStatus,
            vulnClass,
            vulnType,
            description,
            advice,
            hitDetails,
            request,
            response,
            provider,
            reason,
            findTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulnItem {\n");
        sb.append("    vulnId: ").append(toIndentedString(vulnId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    vulnStatus: ").append(toIndentedString(vulnStatus)).append("\n");
        sb.append("    vulnClass: ").append(toIndentedString(vulnClass)).append("\n");
        sb.append("    vulnType: ").append(toIndentedString(vulnType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    advice: ").append(toIndentedString(advice)).append("\n");
        sb.append("    hitDetails: ").append(toIndentedString(hitDetails)).append("\n");
        sb.append("    request: ").append(toIndentedString(request)).append("\n");
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    findTime: ").append(toIndentedString(findTime)).append("\n");
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
