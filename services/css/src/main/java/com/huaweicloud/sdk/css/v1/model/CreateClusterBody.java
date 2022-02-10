package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 集群对象。 */
public class CreateClusterBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backupStrategy")

    private CreateClusterBackupStrategyBody backupStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceNum")

    private Integer instanceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private CreateClusterInstanceBody instance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CreateClusterTagsBody> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private CreateClusterDatastoreBody datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payInfo")

    private PayInfoBody payInfo;

    public CreateClusterBody withName(String name) {
        this.name = name;
        return this;
    }

    /** 集群名称。4～32个字符，只能包含数字、字母、中划线和下划线，且必须以字母开头。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateClusterBody withBackupStrategy(CreateClusterBackupStrategyBody backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public CreateClusterBody withBackupStrategy(Consumer<CreateClusterBackupStrategyBody> backupStrategySetter) {
        if (this.backupStrategy == null) {
            this.backupStrategy = new CreateClusterBackupStrategyBody();
            backupStrategySetter.accept(this.backupStrategy);
        }

        return this;
    }

    /** Get backupStrategy
     * 
     * @return backupStrategy */
    public CreateClusterBackupStrategyBody getBackupStrategy() {
        return backupStrategy;
    }

    public void setBackupStrategy(CreateClusterBackupStrategyBody backupStrategy) {
        this.backupStrategy = backupStrategy;
    }

    public CreateClusterBody withInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }

    /** 集群实例个数，取值范围为1~32。
     * 
     * @return instanceNum */
    public Integer getInstanceNum() {
        return instanceNum;
    }

    public void setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
    }

    public CreateClusterBody withInstance(CreateClusterInstanceBody instance) {
        this.instance = instance;
        return this;
    }

    public CreateClusterBody withInstance(Consumer<CreateClusterInstanceBody> instanceSetter) {
        if (this.instance == null) {
            this.instance = new CreateClusterInstanceBody();
            instanceSetter.accept(this.instance);
        }

        return this;
    }

    /** Get instance
     * 
     * @return instance */
    public CreateClusterInstanceBody getInstance() {
        return instance;
    }

    public void setInstance(CreateClusterInstanceBody instance) {
        this.instance = instance;
    }

    public CreateClusterBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 企业项目ID。创建集群时，给集群绑定企业项目ID。最大长度36个字符，带\"-\"连字符的UUID格式，或者是字符串\"0\"。\"0\"表示默认企业项目。
     * 说明：关于企业项目ID的获取及企业项目特性的详细信息，请参见[《企业管理服务用户指南》](https://support.huaweicloud.com/usermanual-em/zh-cn_topic_0123692049.html)。
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateClusterBody withTags(List<CreateClusterTagsBody> tags) {
        this.tags = tags;
        return this;
    }

    public CreateClusterBody addTagsItem(CreateClusterTagsBody tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateClusterBody withTags(Consumer<List<CreateClusterTagsBody>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 集群标签。 关于标签特性的详细信息，请参见[《标签管理产品介绍》](https://support.huaweicloud.com/productdesc-tms/zh-cn_topic_0071335169.html)。
     * 
     * @return tags */
    public List<CreateClusterTagsBody> getTags() {
        return tags;
    }

    public void setTags(List<CreateClusterTagsBody> tags) {
        this.tags = tags;
    }

    public CreateClusterBody withDatastore(CreateClusterDatastoreBody datastore) {
        this.datastore = datastore;
        return this;
    }

    public CreateClusterBody withDatastore(Consumer<CreateClusterDatastoreBody> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new CreateClusterDatastoreBody();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /** Get datastore
     * 
     * @return datastore */
    public CreateClusterDatastoreBody getDatastore() {
        return datastore;
    }

    public void setDatastore(CreateClusterDatastoreBody datastore) {
        this.datastore = datastore;
    }

    public CreateClusterBody withPayInfo(PayInfoBody payInfo) {
        this.payInfo = payInfo;
        return this;
    }

    public CreateClusterBody withPayInfo(Consumer<PayInfoBody> payInfoSetter) {
        if (this.payInfo == null) {
            this.payInfo = new PayInfoBody();
            payInfoSetter.accept(this.payInfo);
        }

        return this;
    }

    /** Get payInfo
     * 
     * @return payInfo */
    public PayInfoBody getPayInfo() {
        return payInfo;
    }

    public void setPayInfo(PayInfoBody payInfo) {
        this.payInfo = payInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateClusterBody createClusterBody = (CreateClusterBody) o;
        return Objects.equals(this.name, createClusterBody.name)
            && Objects.equals(this.backupStrategy, createClusterBody.backupStrategy)
            && Objects.equals(this.instanceNum, createClusterBody.instanceNum)
            && Objects.equals(this.instance, createClusterBody.instance)
            && Objects.equals(this.enterpriseProjectId, createClusterBody.enterpriseProjectId)
            && Objects.equals(this.tags, createClusterBody.tags)
            && Objects.equals(this.datastore, createClusterBody.datastore)
            && Objects.equals(this.payInfo, createClusterBody.payInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, backupStrategy, instanceNum, instance, enterpriseProjectId, tags, datastore, payInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
        sb.append("    instanceNum: ").append(toIndentedString(instanceNum)).append("\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    payInfo: ").append(toIndentedString(payInfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
