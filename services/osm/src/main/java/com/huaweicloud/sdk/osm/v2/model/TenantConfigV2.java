package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TenantConfigV2
 */
public class TenantConfigV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_case_ccemail_max_count")
    
    private Integer createCaseCcemailMaxCount;

    public TenantConfigV2 withCreateCaseCcemailMaxCount(Integer createCaseCcemailMaxCount) {
        this.createCaseCcemailMaxCount = createCaseCcemailMaxCount;
        return this;
    }

    


    /**
     * 抄送邮箱最大个数
     * minimum: 0
     * maximum: 65535
     * @return createCaseCcemailMaxCount
     */
    public Integer getCreateCaseCcemailMaxCount() {
        return createCaseCcemailMaxCount;
    }

    public void setCreateCaseCcemailMaxCount(Integer createCaseCcemailMaxCount) {
        this.createCaseCcemailMaxCount = createCaseCcemailMaxCount;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TenantConfigV2 tenantConfigV2 = (TenantConfigV2) o;
        return Objects.equals(this.createCaseCcemailMaxCount, tenantConfigV2.createCaseCcemailMaxCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(createCaseCcemailMaxCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TenantConfigV2 {\n");
        sb.append("    createCaseCcemailMaxCount: ").append(toIndentedString(createCaseCcemailMaxCount)).append("\n");
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

