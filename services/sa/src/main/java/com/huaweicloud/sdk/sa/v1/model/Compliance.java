package com.huaweicloud.sdk.sa.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Compliance
 */
public class Compliance  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="related_requirements")
    
    private List<String> relatedRequirements = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status_reasons")
    
    private List<String> statusReasons = null;
    
    public Compliance withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 合规检查结果，取值定义：PASSED、WARNING、FAILED、NOT_AVAILABLE。 说明： PASSED - 接受评估的所有资源都已通过安全检查。 WARNING - 某些信息缺失或配置不支持此检查。 FAILED - 至少有一个接受评估的资源未能通过安全检查。 NOT_AVAILABLE - 由于服务中断或 API 错误，无法执行检查。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public Compliance withRelatedRequirements(List<String> relatedRequirements) {
        this.relatedRequirements = relatedRequirements;
        return this;
    }

    
    public Compliance addRelatedRequirementsItem(String relatedRequirementsItem) {
        if(this.relatedRequirements == null) {
            this.relatedRequirements = new ArrayList<>();
        }
        this.relatedRequirements.add(relatedRequirementsItem);
        return this;
    }

    public Compliance withRelatedRequirements(Consumer<List<String>> relatedRequirementsSetter) {
        if(this.relatedRequirements == null) {
            this.relatedRequirements = new ArrayList<>();
        }
        relatedRequirementsSetter.accept(this.relatedRequirements);
        return this;
    }

    /**
     * 与该合规检查相关的行业或监管要求，最多可以提供32个相关的要求。用规范要求的识别码来标识。
     * @return relatedRequirements
     */
    public List<String> getRelatedRequirements() {
        return relatedRequirements;
    }

    public void setRelatedRequirements(List<String> relatedRequirements) {
        this.relatedRequirements = relatedRequirements;
    }

    

    public Compliance withStatusReasons(List<String> statusReasons) {
        this.statusReasons = statusReasons;
        return this;
    }

    
    public Compliance addStatusReasonsItem(String statusReasonsItem) {
        if(this.statusReasons == null) {
            this.statusReasons = new ArrayList<>();
        }
        this.statusReasons.add(statusReasonsItem);
        return this;
    }

    public Compliance withStatusReasons(Consumer<List<String>> statusReasonsSetter) {
        if(this.statusReasons == null) {
            this.statusReasons = new ArrayList<>();
        }
        statusReasonsSetter.accept(this.statusReasons);
        return this;
    }

    /**
     * 与该合规检查相关的原因。
     * @return statusReasons
     */
    public List<String> getStatusReasons() {
        return statusReasons;
    }

    public void setStatusReasons(List<String> statusReasons) {
        this.statusReasons = statusReasons;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Compliance compliance = (Compliance) o;
        return Objects.equals(this.status, compliance.status) &&
            Objects.equals(this.relatedRequirements, compliance.relatedRequirements) &&
            Objects.equals(this.statusReasons, compliance.statusReasons);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status, relatedRequirements, statusReasons);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Compliance {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    relatedRequirements: ").append(toIndentedString(relatedRequirements)).append("\n");
        sb.append("    statusReasons: ").append(toIndentedString(statusReasons)).append("\n");
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

