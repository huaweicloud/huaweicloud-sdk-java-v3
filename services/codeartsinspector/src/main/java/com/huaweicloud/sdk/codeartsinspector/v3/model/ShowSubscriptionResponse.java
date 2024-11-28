package com.huaweicloud.sdk.codeartsinspector.v3.model;

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
public class ShowSubscriptionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forcePurchase")

    private Boolean forcePurchase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private Integer amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expireTime")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<ShowSubscriptionResources> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isNewUser")

    private Boolean isNewUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public ShowSubscriptionResponse withForcePurchase(Boolean forcePurchase) {
        this.forcePurchase = forcePurchase;
        return this;
    }

    /**
     * forcePurchase
     * @return forcePurchase
     */
    public Boolean getForcePurchase() {
        return forcePurchase;
    }

    public void setForcePurchase(Boolean forcePurchase) {
        this.forcePurchase = forcePurchase;
    }

    public ShowSubscriptionResponse withAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    /**
     * amount
     * minimum: 0
     * @return amount
     */
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public ShowSubscriptionResponse withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * expire_time
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public ShowSubscriptionResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * limit
     * minimum: 0
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowSubscriptionResponse withResources(List<ShowSubscriptionResources> resources) {
        this.resources = resources;
        return this;
    }

    public ShowSubscriptionResponse addResourcesItem(ShowSubscriptionResources resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ShowSubscriptionResponse withResources(Consumer<List<ShowSubscriptionResources>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * resources
     * @return resources
     */
    public List<ShowSubscriptionResources> getResources() {
        return resources;
    }

    public void setResources(List<ShowSubscriptionResources> resources) {
        this.resources = resources;
    }

    public ShowSubscriptionResponse withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * used
     * minimum: 0
     * maximum: 65535
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public ShowSubscriptionResponse withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * type
     * minimum: 0
     * maximum: 65535
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public ShowSubscriptionResponse withIsNewUser(Boolean isNewUser) {
        this.isNewUser = isNewUser;
        return this;
    }

    /**
     * isNewUser
     * @return isNewUser
     */
    public Boolean getIsNewUser() {
        return isNewUser;
    }

    public void setIsNewUser(Boolean isNewUser) {
        this.isNewUser = isNewUser;
    }

    public ShowSubscriptionResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * version
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSubscriptionResponse that = (ShowSubscriptionResponse) obj;
        return Objects.equals(this.forcePurchase, that.forcePurchase) && Objects.equals(this.amount, that.amount)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.resources, that.resources) && Objects.equals(this.used, that.used)
            && Objects.equals(this.type, that.type) && Objects.equals(this.isNewUser, that.isNewUser)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(forcePurchase, amount, expireTime, limit, resources, used, type, isNewUser, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSubscriptionResponse {\n");
        sb.append("    forcePurchase: ").append(toIndentedString(forcePurchase)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    isNewUser: ").append(toIndentedString(isNewUser)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
