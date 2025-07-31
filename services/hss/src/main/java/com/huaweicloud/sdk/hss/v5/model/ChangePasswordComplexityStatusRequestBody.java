package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 请求参数
 */
public class ChangePasswordComplexityStatusRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_all")

    private Boolean operateAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ids")

    private List<String> hostIds = null;

    public ChangePasswordComplexityStatusRequestBody withOperateAll(Boolean operateAll) {
        this.operateAll = operateAll;
        return this;
    }

    /**
     * 是否是全量操作。每次最多处理1000个主机。
     * @return operateAll
     */
    public Boolean getOperateAll() {
        return operateAll;
    }

    public void setOperateAll(Boolean operateAll) {
        this.operateAll = operateAll;
    }

    public ChangePasswordComplexityStatusRequestBody withHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
        return this;
    }

    public ChangePasswordComplexityStatusRequestBody addHostIdsItem(String hostIdsItem) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        this.hostIds.add(hostIdsItem);
        return this;
    }

    public ChangePasswordComplexityStatusRequestBody withHostIds(Consumer<List<String>> hostIdsSetter) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        hostIdsSetter.accept(this.hostIds);
        return this;
    }

    /**
     * 主机id列表。operate_all=ture时不处理host_ids参数。
     * @return hostIds
     */
    public List<String> getHostIds() {
        return hostIds;
    }

    public void setHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangePasswordComplexityStatusRequestBody that = (ChangePasswordComplexityStatusRequestBody) obj;
        return Objects.equals(this.operateAll, that.operateAll) && Objects.equals(this.hostIds, that.hostIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operateAll, hostIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangePasswordComplexityStatusRequestBody {\n");
        sb.append("    operateAll: ").append(toIndentedString(operateAll)).append("\n");
        sb.append("    hostIds: ").append(toIndentedString(hostIds)).append("\n");
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
