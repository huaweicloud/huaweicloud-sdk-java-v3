package com.huaweicloud.sdk.iotda.v5.model;

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
public class ShowTargetsInDevicePolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targets")

    private List<PolicyTargetBase> targets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ShowTargetsInDevicePolicyResponse withTargets(List<PolicyTargetBase> targets) {
        this.targets = targets;
        return this;
    }

    public ShowTargetsInDevicePolicyResponse addTargetsItem(PolicyTargetBase targetsItem) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.add(targetsItem);
        return this;
    }

    public ShowTargetsInDevicePolicyResponse withTargets(Consumer<List<PolicyTargetBase>> targetsSetter) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        targetsSetter.accept(this.targets);
        return this;
    }

    /**
     * 策略绑定信息列表。
     * @return targets
     */
    public List<PolicyTargetBase> getTargets() {
        return targets;
    }

    public void setTargets(List<PolicyTargetBase> targets) {
        this.targets = targets;
    }

    public ShowTargetsInDevicePolicyResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ShowTargetsInDevicePolicyResponse withPage(Consumer<Page> pageSetter) {
        if (this.page == null) {
            this.page = new Page();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTargetsInDevicePolicyResponse that = (ShowTargetsInDevicePolicyResponse) obj;
        return Objects.equals(this.targets, that.targets) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targets, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTargetsInDevicePolicyResponse {\n");
        sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
