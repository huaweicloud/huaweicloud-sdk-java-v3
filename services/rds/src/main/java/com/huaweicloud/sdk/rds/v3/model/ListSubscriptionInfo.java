package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 订阅详情。
 */
public class ListSubscriptionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publication_id")

    private String publicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publication_name")

    private String publicationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_cloud")

    private Boolean isCloud;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_database")

    private String subscriptionDatabase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_type")

    private String subscriptionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publication_subscription")

    private Subscription4PublicationInfo publicationSubscription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_subscription")

    private Subscription4InstanceInfo localSubscription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_schedule")

    private UsedJobSchedule jobSchedule;

    public ListSubscriptionInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 订阅id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListSubscriptionInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 订阅状态。normal，abnormal，creating，createfail
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListSubscriptionInfo withPublicationId(String publicationId) {
        this.publicationId = publicationId;
        return this;
    }

    /**
     * 发布id。
     * @return publicationId
     */
    public String getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(String publicationId) {
        this.publicationId = publicationId;
    }

    public ListSubscriptionInfo withPublicationName(String publicationName) {
        this.publicationName = publicationName;
        return this;
    }

    /**
     * 发布名称。
     * @return publicationName
     */
    public String getPublicationName() {
        return publicationName;
    }

    public void setPublicationName(String publicationName) {
        this.publicationName = publicationName;
    }

    public ListSubscriptionInfo withIsCloud(Boolean isCloud) {
        this.isCloud = isCloud;
        return this;
    }

    /**
     * 订阅服务器来源。true：订阅服务器为云上实例, false：订阅服务器非云上实例。
     * @return isCloud
     */
    public Boolean getIsCloud() {
        return isCloud;
    }

    public void setIsCloud(Boolean isCloud) {
        this.isCloud = isCloud;
    }

    public ListSubscriptionInfo withSubscriptionDatabase(String subscriptionDatabase) {
        this.subscriptionDatabase = subscriptionDatabase;
        return this;
    }

    /**
     * 目标数据库名。
     * @return subscriptionDatabase
     */
    public String getSubscriptionDatabase() {
        return subscriptionDatabase;
    }

    public void setSubscriptionDatabase(String subscriptionDatabase) {
        this.subscriptionDatabase = subscriptionDatabase;
    }

    public ListSubscriptionInfo withSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }

    /**
     * 订阅方式，push:推送。
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public ListSubscriptionInfo withPublicationSubscription(Subscription4PublicationInfo publicationSubscription) {
        this.publicationSubscription = publicationSubscription;
        return this;
    }

    public ListSubscriptionInfo withPublicationSubscription(
        Consumer<Subscription4PublicationInfo> publicationSubscriptionSetter) {
        if (this.publicationSubscription == null) {
            this.publicationSubscription = new Subscription4PublicationInfo();
            publicationSubscriptionSetter.accept(this.publicationSubscription);
        }

        return this;
    }

    /**
     * Get publicationSubscription
     * @return publicationSubscription
     */
    public Subscription4PublicationInfo getPublicationSubscription() {
        return publicationSubscription;
    }

    public void setPublicationSubscription(Subscription4PublicationInfo publicationSubscription) {
        this.publicationSubscription = publicationSubscription;
    }

    public ListSubscriptionInfo withLocalSubscription(Subscription4InstanceInfo localSubscription) {
        this.localSubscription = localSubscription;
        return this;
    }

    public ListSubscriptionInfo withLocalSubscription(Consumer<Subscription4InstanceInfo> localSubscriptionSetter) {
        if (this.localSubscription == null) {
            this.localSubscription = new Subscription4InstanceInfo();
            localSubscriptionSetter.accept(this.localSubscription);
        }

        return this;
    }

    /**
     * Get localSubscription
     * @return localSubscription
     */
    public Subscription4InstanceInfo getLocalSubscription() {
        return localSubscription;
    }

    public void setLocalSubscription(Subscription4InstanceInfo localSubscription) {
        this.localSubscription = localSubscription;
    }

    public ListSubscriptionInfo withJobSchedule(UsedJobSchedule jobSchedule) {
        this.jobSchedule = jobSchedule;
        return this;
    }

    public ListSubscriptionInfo withJobSchedule(Consumer<UsedJobSchedule> jobScheduleSetter) {
        if (this.jobSchedule == null) {
            this.jobSchedule = new UsedJobSchedule();
            jobScheduleSetter.accept(this.jobSchedule);
        }

        return this;
    }

    /**
     * Get jobSchedule
     * @return jobSchedule
     */
    public UsedJobSchedule getJobSchedule() {
        return jobSchedule;
    }

    public void setJobSchedule(UsedJobSchedule jobSchedule) {
        this.jobSchedule = jobSchedule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubscriptionInfo that = (ListSubscriptionInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.publicationId, that.publicationId)
            && Objects.equals(this.publicationName, that.publicationName) && Objects.equals(this.isCloud, that.isCloud)
            && Objects.equals(this.subscriptionDatabase, that.subscriptionDatabase)
            && Objects.equals(this.subscriptionType, that.subscriptionType)
            && Objects.equals(this.publicationSubscription, that.publicationSubscription)
            && Objects.equals(this.localSubscription, that.localSubscription)
            && Objects.equals(this.jobSchedule, that.jobSchedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            publicationId,
            publicationName,
            isCloud,
            subscriptionDatabase,
            subscriptionType,
            publicationSubscription,
            localSubscription,
            jobSchedule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubscriptionInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    publicationId: ").append(toIndentedString(publicationId)).append("\n");
        sb.append("    publicationName: ").append(toIndentedString(publicationName)).append("\n");
        sb.append("    isCloud: ").append(toIndentedString(isCloud)).append("\n");
        sb.append("    subscriptionDatabase: ").append(toIndentedString(subscriptionDatabase)).append("\n");
        sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
        sb.append("    publicationSubscription: ").append(toIndentedString(publicationSubscription)).append("\n");
        sb.append("    localSubscription: ").append(toIndentedString(localSubscription)).append("\n");
        sb.append("    jobSchedule: ").append(toIndentedString(jobSchedule)).append("\n");
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
