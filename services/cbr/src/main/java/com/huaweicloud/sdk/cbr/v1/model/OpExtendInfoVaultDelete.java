package com.huaweicloud.sdk.cbr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * OpExtendInfoVaultDelete
 */
public class OpExtendInfoVaultDelete  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fail_count")
    
    private Integer failCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;

    public OpExtendInfoVaultDelete withFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }

    


    /**
     * 删除失败的资源数量
     * @return failCount
     */
    public Integer getFailCount() {
        return failCount;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    

    public OpExtendInfoVaultDelete withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 删除的备份数量
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpExtendInfoVaultDelete opExtendInfoVaultDelete = (OpExtendInfoVaultDelete) o;
        return Objects.equals(this.failCount, opExtendInfoVaultDelete.failCount) &&
            Objects.equals(this.totalCount, opExtendInfoVaultDelete.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(failCount, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpExtendInfoVaultDelete {\n");
        sb.append("    failCount: ").append(toIndentedString(failCount)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

