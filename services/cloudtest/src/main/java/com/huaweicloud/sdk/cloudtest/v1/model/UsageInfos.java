package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源已用容量对象
 */
public class UsageInfos {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private String amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private String used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_percent")

    private Integer usedPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_info")

    private List<UsageInfos> usageInfo = null;

    public UsageInfos withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UsageInfos withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 资源标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UsageInfos withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 资源总量
     * @return amount
     */
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public UsageInfos withUsed(String used) {
        this.used = used;
        return this;
    }

    /**
     * 已消耗用量
     * @return used
     */
    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    public UsageInfos withUsedPercent(Integer usedPercent) {
        this.usedPercent = usedPercent;
        return this;
    }

    /**
     * 资源已用容量百分比,例如80% 值为80
     * @return usedPercent
     */
    public Integer getUsedPercent() {
        return usedPercent;
    }

    public void setUsedPercent(Integer usedPercent) {
        this.usedPercent = usedPercent;
    }

    public UsageInfos withUsageInfo(List<UsageInfos> usageInfo) {
        this.usageInfo = usageInfo;
        return this;
    }

    public UsageInfos addUsageInfoItem(UsageInfos usageInfoItem) {
        if (this.usageInfo == null) {
            this.usageInfo = new ArrayList<>();
        }
        this.usageInfo.add(usageInfoItem);
        return this;
    }

    public UsageInfos withUsageInfo(Consumer<List<UsageInfos>> usageInfoSetter) {
        if (this.usageInfo == null) {
            this.usageInfo = new ArrayList<>();
        }
        usageInfoSetter.accept(this.usageInfo);
        return this;
    }

    /**
     * 版本超限信息
     * @return usageInfo
     */
    public List<UsageInfos> getUsageInfo() {
        return usageInfo;
    }

    public void setUsageInfo(List<UsageInfos> usageInfo) {
        this.usageInfo = usageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UsageInfos that = (UsageInfos) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.id, that.id)
            && Objects.equals(this.amount, that.amount) && Objects.equals(this.used, that.used)
            && Objects.equals(this.usedPercent, that.usedPercent) && Objects.equals(this.usageInfo, that.usageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, amount, used, usedPercent, usageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsageInfos {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    usedPercent: ").append(toIndentedString(usedPercent)).append("\n");
        sb.append("    usageInfo: ").append(toIndentedString(usageInfo)).append("\n");
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
