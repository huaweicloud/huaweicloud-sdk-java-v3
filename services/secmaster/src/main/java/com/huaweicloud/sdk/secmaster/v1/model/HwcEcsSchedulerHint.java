package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 弹性云服务器调度信息。
 */
public class HwcEcsSchedulerHint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private List<String> group = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenancy")

    private List<String> tenancy = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_host_id")

    private List<String> dedicatedHostId = null;

    public HwcEcsSchedulerHint withGroup(List<String> group) {
        this.group = group;
        return this;
    }

    public HwcEcsSchedulerHint addGroupItem(String groupItem) {
        if (this.group == null) {
            this.group = new ArrayList<>();
        }
        this.group.add(groupItem);
        return this;
    }

    public HwcEcsSchedulerHint withGroup(Consumer<List<String>> groupSetter) {
        if (this.group == null) {
            this.group = new ArrayList<>();
        }
        groupSetter.accept(this.group);
        return this;
    }

    /**
     * 云服务器组ID，UUID格式。 云服务器组的ID可以从控制台或者参考查询云服务器组列表获取。
     * @return group
     */
    public List<String> getGroup() {
        return group;
    }

    public void setGroup(List<String> group) {
        this.group = group;
    }

    public HwcEcsSchedulerHint withTenancy(List<String> tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    public HwcEcsSchedulerHint addTenancyItem(String tenancyItem) {
        if (this.tenancy == null) {
            this.tenancy = new ArrayList<>();
        }
        this.tenancy.add(tenancyItem);
        return this;
    }

    public HwcEcsSchedulerHint withTenancy(Consumer<List<String>> tenancySetter) {
        if (this.tenancy == null) {
            this.tenancy = new ArrayList<>();
        }
        tenancySetter.accept(this.tenancy);
        return this;
    }

    /**
     * 在指定的专属主机或者共享主机上创建弹性云服务器。 参数值为shared或者dedicated。
     * @return tenancy
     */
    public List<String> getTenancy() {
        return tenancy;
    }

    public void setTenancy(List<String> tenancy) {
        this.tenancy = tenancy;
    }

    public HwcEcsSchedulerHint withDedicatedHostId(List<String> dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    public HwcEcsSchedulerHint addDedicatedHostIdItem(String dedicatedHostIdItem) {
        if (this.dedicatedHostId == null) {
            this.dedicatedHostId = new ArrayList<>();
        }
        this.dedicatedHostId.add(dedicatedHostIdItem);
        return this;
    }

    public HwcEcsSchedulerHint withDedicatedHostId(Consumer<List<String>> dedicatedHostIdSetter) {
        if (this.dedicatedHostId == null) {
            this.dedicatedHostId = new ArrayList<>();
        }
        dedicatedHostIdSetter.accept(this.dedicatedHostId);
        return this;
    }

    /**
     * 专属主机的ID。 说明： 专属主机的ID仅在tenancy为dedicated时生效。
     * @return dedicatedHostId
     */
    public List<String> getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(List<String> dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HwcEcsSchedulerHint that = (HwcEcsSchedulerHint) obj;
        return Objects.equals(this.group, that.group) && Objects.equals(this.tenancy, that.tenancy)
            && Objects.equals(this.dedicatedHostId, that.dedicatedHostId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group, tenancy, dedicatedHostId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HwcEcsSchedulerHint {\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
        sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
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
