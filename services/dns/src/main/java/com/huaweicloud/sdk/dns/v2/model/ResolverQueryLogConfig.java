package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResolverQueryLogConfig
 */
public class ResolverQueryLogConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_group_id")

    private String ltsGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_topic_id")

    private String ltsTopicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_ids")

    private List<String> vpcIds = null;

    public ResolverQueryLogConfig withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 解析器访问日志的ID，UUID形式的一个资源标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ResolverQueryLogConfig withLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
        return this;
    }

    /**
     * 日志组ID。
     * @return ltsGroupId
     */
    public String getLtsGroupId() {
        return ltsGroupId;
    }

    public void setLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
    }

    public ResolverQueryLogConfig withLtsTopicId(String ltsTopicId) {
        this.ltsTopicId = ltsTopicId;
        return this;
    }

    /**
     * 日志流ID。
     * @return ltsTopicId
     */
    public String getLtsTopicId() {
        return ltsTopicId;
    }

    public void setLtsTopicId(String ltsTopicId) {
        this.ltsTopicId = ltsTopicId;
    }

    public ResolverQueryLogConfig withVpcIds(List<String> vpcIds) {
        this.vpcIds = vpcIds;
        return this;
    }

    public ResolverQueryLogConfig addVpcIdsItem(String vpcIdsItem) {
        if (this.vpcIds == null) {
            this.vpcIds = new ArrayList<>();
        }
        this.vpcIds.add(vpcIdsItem);
        return this;
    }

    public ResolverQueryLogConfig withVpcIds(Consumer<List<String>> vpcIdsSetter) {
        if (this.vpcIds == null) {
            this.vpcIds = new ArrayList<>();
        }
        vpcIdsSetter.accept(this.vpcIds);
        return this;
    }

    /**
     * 关联的VPC ID列表。
     * @return vpcIds
     */
    public List<String> getVpcIds() {
        return vpcIds;
    }

    public void setVpcIds(List<String> vpcIds) {
        this.vpcIds = vpcIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResolverQueryLogConfig that = (ResolverQueryLogConfig) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.ltsGroupId, that.ltsGroupId)
            && Objects.equals(this.ltsTopicId, that.ltsTopicId) && Objects.equals(this.vpcIds, that.vpcIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ltsGroupId, ltsTopicId, vpcIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResolverQueryLogConfig {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ltsGroupId: ").append(toIndentedString(ltsGroupId)).append("\n");
        sb.append("    ltsTopicId: ").append(toIndentedString(ltsTopicId)).append("\n");
        sb.append("    vpcIds: ").append(toIndentedString(vpcIds)).append("\n");
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
