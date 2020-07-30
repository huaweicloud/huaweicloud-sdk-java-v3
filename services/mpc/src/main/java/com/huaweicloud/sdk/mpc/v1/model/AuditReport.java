package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AuditReport
 */
public class AuditReport  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="black_position")
    
    private String blackPosition;

    public AuditReport withBlackPosition(String blackPosition) {
        this.blackPosition = blackPosition;
        return this;
    }

    


    /**
     * 疑似黑边位置信息，参数格式：top:bottom:left:right 
     * @return blackPosition
     */
    public String getBlackPosition() {
        return blackPosition;
    }

    public void setBlackPosition(String blackPosition) {
        this.blackPosition = blackPosition;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuditReport auditReport = (AuditReport) o;
        return Objects.equals(this.blackPosition, auditReport.blackPosition);
    }
    @Override
    public int hashCode() {
        return Objects.hash(blackPosition);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditReport {\n");
        sb.append("    blackPosition: ").append(toIndentedString(blackPosition)).append("\n");
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

