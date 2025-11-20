package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 业务共享配置
 */
public class ServiceSharedConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional_project_ids")

    private List<String> optionalProjectIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_need_review")

    private Boolean noNeedReview;

    public ServiceSharedConfig withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 开启共享配置
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public ServiceSharedConfig withOptionalProjectIds(List<String> optionalProjectIds) {
        this.optionalProjectIds = optionalProjectIds;
        return this;
    }

    public ServiceSharedConfig addOptionalProjectIdsItem(String optionalProjectIdsItem) {
        if (this.optionalProjectIds == null) {
            this.optionalProjectIds = new ArrayList<>();
        }
        this.optionalProjectIds.add(optionalProjectIdsItem);
        return this;
    }

    public ServiceSharedConfig withOptionalProjectIds(Consumer<List<String>> optionalProjectIdsSetter) {
        if (this.optionalProjectIds == null) {
            this.optionalProjectIds = new ArrayList<>();
        }
        optionalProjectIdsSetter.accept(this.optionalProjectIds);
        return this;
    }

    /**
     * 可选的共享租户列表
     * @return optionalProjectIds
     */
    public List<String> getOptionalProjectIds() {
        return optionalProjectIds;
    }

    public void setOptionalProjectIds(List<String> optionalProjectIds) {
        this.optionalProjectIds = optionalProjectIds;
    }

    public ServiceSharedConfig withNoNeedReview(Boolean noNeedReview) {
        this.noNeedReview = noNeedReview;
        return this;
    }

    /**
     * 共享免审核
     * @return noNeedReview
     */
    public Boolean getNoNeedReview() {
        return noNeedReview;
    }

    public void setNoNeedReview(Boolean noNeedReview) {
        this.noNeedReview = noNeedReview;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceSharedConfig that = (ServiceSharedConfig) obj;
        return Objects.equals(this.enable, that.enable)
            && Objects.equals(this.optionalProjectIds, that.optionalProjectIds)
            && Objects.equals(this.noNeedReview, that.noNeedReview);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, optionalProjectIds, noNeedReview);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceSharedConfig {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    optionalProjectIds: ").append(toIndentedString(optionalProjectIds)).append("\n");
        sb.append("    noNeedReview: ").append(toIndentedString(noNeedReview)).append("\n");
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
