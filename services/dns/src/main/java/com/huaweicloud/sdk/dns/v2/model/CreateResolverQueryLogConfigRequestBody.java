package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateResolverQueryLogConfigRequestBody
 */
public class CreateResolverQueryLogConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_group_id")

    private String ltsGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_topic_id")

    private String ltsTopicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    private Vpc vpc;

    public CreateResolverQueryLogConfigRequestBody withLtsGroupId(String ltsGroupId) {
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

    public CreateResolverQueryLogConfigRequestBody withLtsTopicId(String ltsTopicId) {
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

    public CreateResolverQueryLogConfigRequestBody withVpc(Vpc vpc) {
        this.vpc = vpc;
        return this;
    }

    public CreateResolverQueryLogConfigRequestBody withVpc(Consumer<Vpc> vpcSetter) {
        if (this.vpc == null) {
            this.vpc = new Vpc();
            vpcSetter.accept(this.vpc);
        }

        return this;
    }

    /**
     * Get vpc
     * @return vpc
     */
    public Vpc getVpc() {
        return vpc;
    }

    public void setVpc(Vpc vpc) {
        this.vpc = vpc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateResolverQueryLogConfigRequestBody that = (CreateResolverQueryLogConfigRequestBody) obj;
        return Objects.equals(this.ltsGroupId, that.ltsGroupId) && Objects.equals(this.ltsTopicId, that.ltsTopicId)
            && Objects.equals(this.vpc, that.vpc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ltsGroupId, ltsTopicId, vpc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResolverQueryLogConfigRequestBody {\n");
        sb.append("    ltsGroupId: ").append(toIndentedString(ltsGroupId)).append("\n");
        sb.append("    ltsTopicId: ").append(toIndentedString(ltsTopicId)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
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
