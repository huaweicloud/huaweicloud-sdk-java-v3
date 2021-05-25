package com.huaweicloud.sdk.dli.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListQueuesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="with-priv")
    
    private Boolean withPriv;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="with-charge-info")
    
    private Boolean withChargeInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="queue_type")
    
    private String queueType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private String tags;

    public ListQueuesRequest withWithPriv(Boolean withPriv) {
        this.withPriv = withPriv;
        return this;
    }

    


    /**
     * 是否返回权限信息。
     * @return withPriv
     */
    public Boolean getWithPriv() {
        return withPriv;
    }

    public void setWithPriv(Boolean withPriv) {
        this.withPriv = withPriv;
    }

    

    public ListQueuesRequest withWithChargeInfo(Boolean withChargeInfo) {
        this.withChargeInfo = withChargeInfo;
        return this;
    }

    


    /**
     * 是否返回收费信息
     * @return withChargeInfo
     */
    public Boolean getWithChargeInfo() {
        return withChargeInfo;
    }

    public void setWithChargeInfo(Boolean withChargeInfo) {
        this.withChargeInfo = withChargeInfo;
    }

    

    public ListQueuesRequest withQueueType(String queueType) {
        this.queueType = queueType;
        return this;
    }

    


    /**
     * 队列的类型,。有如下三种类型： sql general all 如果不指定，默认为sql。
     * @return queueType
     */
    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    

    public ListQueuesRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    


    /**
     * 查询根据标签进行过滤
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListQueuesRequest listQueuesRequest = (ListQueuesRequest) o;
        return Objects.equals(this.withPriv, listQueuesRequest.withPriv) &&
            Objects.equals(this.withChargeInfo, listQueuesRequest.withChargeInfo) &&
            Objects.equals(this.queueType, listQueuesRequest.queueType) &&
            Objects.equals(this.tags, listQueuesRequest.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(withPriv, withChargeInfo, queueType, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQueuesRequest {\n");
        sb.append("    withPriv: ").append(toIndentedString(withPriv)).append("\n");
        sb.append("    withChargeInfo: ").append(toIndentedString(withChargeInfo)).append("\n");
        sb.append("    queueType: ").append(toIndentedString(queueType)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

