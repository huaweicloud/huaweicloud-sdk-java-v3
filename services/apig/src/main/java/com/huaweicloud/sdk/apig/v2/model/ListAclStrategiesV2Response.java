package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAclStrategiesV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acls")

    private List<ApiAclInfoWithBindNum> acls = null;

    public ListAclStrategiesV2Response withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 本次返回的列表长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListAclStrategiesV2Response withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 满足条件的记录数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListAclStrategiesV2Response withAcls(List<ApiAclInfoWithBindNum> acls) {
        this.acls = acls;
        return this;
    }

    public ListAclStrategiesV2Response addAclsItem(ApiAclInfoWithBindNum aclsItem) {
        if (this.acls == null) {
            this.acls = new ArrayList<>();
        }
        this.acls.add(aclsItem);
        return this;
    }

    public ListAclStrategiesV2Response withAcls(Consumer<List<ApiAclInfoWithBindNum>> aclsSetter) {
        if (this.acls == null) {
            this.acls = new ArrayList<>();
        }
        aclsSetter.accept(this.acls);
        return this;
    }

    /**
     * 本次查询返回的ACL策略列表
     * @return acls
     */
    public List<ApiAclInfoWithBindNum> getAcls() {
        return acls;
    }

    public void setAcls(List<ApiAclInfoWithBindNum> acls) {
        this.acls = acls;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAclStrategiesV2Response listAclStrategiesV2Response = (ListAclStrategiesV2Response) o;
        return Objects.equals(this.size, listAclStrategiesV2Response.size)
            && Objects.equals(this.total, listAclStrategiesV2Response.total)
            && Objects.equals(this.acls, listAclStrategiesV2Response.acls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, acls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAclStrategiesV2Response {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    acls: ").append(toIndentedString(acls)).append("\n");
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
