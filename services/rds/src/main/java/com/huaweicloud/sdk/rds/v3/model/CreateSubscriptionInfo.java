package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 订阅详情
 */
public class CreateSubscriptionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_database")

    private String subscriptionDatabase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_type")

    private String subscriptionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initialize_at")

    private String initializeAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initialize_info")

    private CreateSubscriptionInfoInitializeInfo initializeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "independent_agent")

    private Boolean independentAgent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_schedule")

    private OperateUsedJobSchedule jobSchedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bak_file_name")

    private String bakFileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bak_bucket_name")

    private String bakBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publication_subscription")

    private CreateSubscription4PublicationInfo publicationSubscription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_subscription")

    private CreateSubscription4InstanceInfo localSubscription;

    public CreateSubscriptionInfo withSubscriptionDatabase(String subscriptionDatabase) {
        this.subscriptionDatabase = subscriptionDatabase;
        return this;
    }

    /**
     * 订阅数据库名。
     * @return subscriptionDatabase
     */
    public String getSubscriptionDatabase() {
        return subscriptionDatabase;
    }

    public void setSubscriptionDatabase(String subscriptionDatabase) {
        this.subscriptionDatabase = subscriptionDatabase;
    }

    public CreateSubscriptionInfo withSubscriptionType(String subscriptionType) {
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

    public CreateSubscriptionInfo withInitializeAt(String initializeAt) {
        this.initializeAt = initializeAt;
        return this;
    }

    /**
     * 初始化类型：不初始化(do_not)、立即初始化(immediate)、首次同步初始化(at_first_sync)。
     * @return initializeAt
     */
    public String getInitializeAt() {
        return initializeAt;
    }

    public void setInitializeAt(String initializeAt) {
        this.initializeAt = initializeAt;
    }

    public CreateSubscriptionInfo withInitializeInfo(CreateSubscriptionInfoInitializeInfo initializeInfo) {
        this.initializeInfo = initializeInfo;
        return this;
    }

    public CreateSubscriptionInfo withInitializeInfo(
        Consumer<CreateSubscriptionInfoInitializeInfo> initializeInfoSetter) {
        if (this.initializeInfo == null) {
            this.initializeInfo = new CreateSubscriptionInfoInitializeInfo();
            initializeInfoSetter.accept(this.initializeInfo);
        }

        return this;
    }

    /**
     * Get initializeInfo
     * @return initializeInfo
     */
    public CreateSubscriptionInfoInitializeInfo getInitializeInfo() {
        return initializeInfo;
    }

    public void setInitializeInfo(CreateSubscriptionInfoInitializeInfo initializeInfo) {
        this.initializeInfo = initializeInfo;
    }

    public CreateSubscriptionInfo withIndependentAgent(Boolean independentAgent) {
        this.independentAgent = independentAgent;
        return this;
    }

    /**
     * 独立的分发代理。  true：使用。 false：不使用。
     * @return independentAgent
     */
    public Boolean getIndependentAgent() {
        return independentAgent;
    }

    public void setIndependentAgent(Boolean independentAgent) {
        this.independentAgent = independentAgent;
    }

    public CreateSubscriptionInfo withJobSchedule(OperateUsedJobSchedule jobSchedule) {
        this.jobSchedule = jobSchedule;
        return this;
    }

    public CreateSubscriptionInfo withJobSchedule(Consumer<OperateUsedJobSchedule> jobScheduleSetter) {
        if (this.jobSchedule == null) {
            this.jobSchedule = new OperateUsedJobSchedule();
            jobScheduleSetter.accept(this.jobSchedule);
        }

        return this;
    }

    /**
     * Get jobSchedule
     * @return jobSchedule
     */
    public OperateUsedJobSchedule getJobSchedule() {
        return jobSchedule;
    }

    public void setJobSchedule(OperateUsedJobSchedule jobSchedule) {
        this.jobSchedule = jobSchedule;
    }

    public CreateSubscriptionInfo withBakFileName(String bakFileName) {
        this.bakFileName = bakFileName;
        return this;
    }

    /**
     * 备份文件名称。若该值不为空，则订阅初始化方式为通过备份文件初始化。
     * @return bakFileName
     */
    public String getBakFileName() {
        return bakFileName;
    }

    public void setBakFileName(String bakFileName) {
        this.bakFileName = bakFileName;
    }

    public CreateSubscriptionInfo withBakBucketName(String bakBucketName) {
        this.bakBucketName = bakBucketName;
        return this;
    }

    /**
     * 备份文件所在的obs桶名。 若bak_file_name为空，该参数无效。 若该值为空，则备份文件来源为rds的备份文件。 若该值不为空，则备份文件来源为用户obs桶。
     * @return bakBucketName
     */
    public String getBakBucketName() {
        return bakBucketName;
    }

    public void setBakBucketName(String bakBucketName) {
        this.bakBucketName = bakBucketName;
    }

    public CreateSubscriptionInfo withPublicationSubscription(
        CreateSubscription4PublicationInfo publicationSubscription) {
        this.publicationSubscription = publicationSubscription;
        return this;
    }

    public CreateSubscriptionInfo withPublicationSubscription(
        Consumer<CreateSubscription4PublicationInfo> publicationSubscriptionSetter) {
        if (this.publicationSubscription == null) {
            this.publicationSubscription = new CreateSubscription4PublicationInfo();
            publicationSubscriptionSetter.accept(this.publicationSubscription);
        }

        return this;
    }

    /**
     * Get publicationSubscription
     * @return publicationSubscription
     */
    public CreateSubscription4PublicationInfo getPublicationSubscription() {
        return publicationSubscription;
    }

    public void setPublicationSubscription(CreateSubscription4PublicationInfo publicationSubscription) {
        this.publicationSubscription = publicationSubscription;
    }

    public CreateSubscriptionInfo withLocalSubscription(CreateSubscription4InstanceInfo localSubscription) {
        this.localSubscription = localSubscription;
        return this;
    }

    public CreateSubscriptionInfo withLocalSubscription(
        Consumer<CreateSubscription4InstanceInfo> localSubscriptionSetter) {
        if (this.localSubscription == null) {
            this.localSubscription = new CreateSubscription4InstanceInfo();
            localSubscriptionSetter.accept(this.localSubscription);
        }

        return this;
    }

    /**
     * Get localSubscription
     * @return localSubscription
     */
    public CreateSubscription4InstanceInfo getLocalSubscription() {
        return localSubscription;
    }

    public void setLocalSubscription(CreateSubscription4InstanceInfo localSubscription) {
        this.localSubscription = localSubscription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSubscriptionInfo that = (CreateSubscriptionInfo) obj;
        return Objects.equals(this.subscriptionDatabase, that.subscriptionDatabase)
            && Objects.equals(this.subscriptionType, that.subscriptionType)
            && Objects.equals(this.initializeAt, that.initializeAt)
            && Objects.equals(this.initializeInfo, that.initializeInfo)
            && Objects.equals(this.independentAgent, that.independentAgent)
            && Objects.equals(this.jobSchedule, that.jobSchedule) && Objects.equals(this.bakFileName, that.bakFileName)
            && Objects.equals(this.bakBucketName, that.bakBucketName)
            && Objects.equals(this.publicationSubscription, that.publicationSubscription)
            && Objects.equals(this.localSubscription, that.localSubscription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionDatabase,
            subscriptionType,
            initializeAt,
            initializeInfo,
            independentAgent,
            jobSchedule,
            bakFileName,
            bakBucketName,
            publicationSubscription,
            localSubscription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubscriptionInfo {\n");
        sb.append("    subscriptionDatabase: ").append(toIndentedString(subscriptionDatabase)).append("\n");
        sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
        sb.append("    initializeAt: ").append(toIndentedString(initializeAt)).append("\n");
        sb.append("    initializeInfo: ").append(toIndentedString(initializeInfo)).append("\n");
        sb.append("    independentAgent: ").append(toIndentedString(independentAgent)).append("\n");
        sb.append("    jobSchedule: ").append(toIndentedString(jobSchedule)).append("\n");
        sb.append("    bakFileName: ").append(toIndentedString(bakFileName)).append("\n");
        sb.append("    bakBucketName: ").append(toIndentedString(bakBucketName)).append("\n");
        sb.append("    publicationSubscription: ").append(toIndentedString(publicationSubscription)).append("\n");
        sb.append("    localSubscription: ").append(toIndentedString(localSubscription)).append("\n");
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
