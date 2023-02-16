package com.huaweicloud.sdk.aom.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 脚本的引用详情。
 */
public class ScriptReferenceDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reference_name")
    
    
    private String referenceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reference_id")
    
    
    private String referenceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reference_type")
    
    
    private String referenceType;

    public ScriptReferenceDetail withReferenceName(String referenceName) {
        this.referenceName = referenceName;
        return this;
    }

    


    /**
     * 引用的任务名称
     * @return referenceName
     */
    public String getReferenceName() {
        return referenceName;
    }

    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
    }

    

    public ScriptReferenceDetail withReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }

    


    /**
     * 引用id
     * @return referenceId
     */
    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    

    public ScriptReferenceDetail withReferenceType(String referenceType) {
        this.referenceType = referenceType;
        return this;
    }

    


    /**
     * 引用的任务类型
     * @return referenceType
     */
    public String getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScriptReferenceDetail scriptReferenceDetail = (ScriptReferenceDetail) o;
        return Objects.equals(this.referenceName, scriptReferenceDetail.referenceName) &&
            Objects.equals(this.referenceId, scriptReferenceDetail.referenceId) &&
            Objects.equals(this.referenceType, scriptReferenceDetail.referenceType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(referenceName, referenceId, referenceType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScriptReferenceDetail {\n");
        sb.append("    referenceName: ").append(toIndentedString(referenceName)).append("\n");
        sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
        sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
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

