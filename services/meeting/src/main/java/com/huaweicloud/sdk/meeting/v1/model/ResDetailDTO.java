package com.huaweicloud.sdk.meeting.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResDetailDTO
 */
public class ResDetailDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sumCount")
    
    private Integer sumCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="usedCount")
    
    private Integer usedCount;

    public ResDetailDTO withSumCount(Integer sumCount) {
        this.sumCount = sumCount;
        return this;
    }

    


    /**
     * 总数
     * @return sumCount
     */
    public Integer getSumCount() {
        return sumCount;
    }

    public void setSumCount(Integer sumCount) {
        this.sumCount = sumCount;
    }

    public ResDetailDTO withUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
        return this;
    }

    


    /**
     * 已使用数（录播存储空间、会议并发、推流并发方数暂无法查询）。
     * @return usedCount
     */
    public Integer getUsedCount() {
        return usedCount;
    }

    public void setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResDetailDTO resDetailDTO = (ResDetailDTO) o;
        return Objects.equals(this.sumCount, resDetailDTO.sumCount) &&
            Objects.equals(this.usedCount, resDetailDTO.usedCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sumCount, usedCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResDetailDTO {\n");
        sb.append("    sumCount: ").append(toIndentedString(sumCount)).append("\n");
        sb.append("    usedCount: ").append(toIndentedString(usedCount)).append("\n");
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

