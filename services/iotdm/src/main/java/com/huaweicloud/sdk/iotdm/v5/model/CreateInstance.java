package com.huaweicloud.sdk.iotdm.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateInstance
 */
public class CreateInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private Flavor flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_info")

    private ChargeInfo chargeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional_params")

    private AdditionalParams additionalParams;

    public CreateInstance withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * **参数说明**：创建的实例类型。实例类型说明参见[[产品规格说明](https://support.huaweicloud.com/productdesc-iothub/iot_04_0014.html)](tag:hws)[[产品规格说明](https://support.huaweicloud.com/intl/zh-cn/productdesc-iothub/iot_04_0014.html)](tag:hws_hk)。 **取值范围**： - standard：标准版实例 - enterprise：企业版实例 
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public CreateInstance withFlavor(Flavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public CreateInstance withFlavor(Consumer<Flavor> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new Flavor();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public Flavor getFlavor() {
        return flavor;
    }

    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
    }

    public CreateInstance withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数说明**：实例名称 **取值范围**：由中文字符，英文字母、数字及“_”、“-”组成，且长度为[1-64]个字符。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateInstance withChargeInfo(ChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public CreateInstance withChargeInfo(Consumer<ChargeInfo> chargeInfoSetter) {
        if (this.chargeInfo == null) {
            this.chargeInfo = new ChargeInfo();
            chargeInfoSetter.accept(this.chargeInfo);
        }

        return this;
    }

    /**
     * Get chargeInfo
     * @return chargeInfo
     */
    public ChargeInfo getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(ChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

    public CreateInstance withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：设备接入实例的描述信息。 **取值范围**：由中文，字母，数字，句号，逗号，下划线（“_”），中划线（“-”），空格组成，且长度为[1-256]个字符。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateInstance withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数说明**：企业项目Id。此字段填写明确的企业项目Id或者0(表示默认企业项目Id)时支持企业项目特性。可以企业项目管理服务中获取。 **取值范围**：长度不超过36，由小写字母[a-f]、数字、连接符（-）的组成。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateInstance withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateInstance addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateInstance withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数说明**：设备接入实例的标签信息。 
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public CreateInstance withAdditionalParams(AdditionalParams additionalParams) {
        this.additionalParams = additionalParams;
        return this;
    }

    public CreateInstance withAdditionalParams(Consumer<AdditionalParams> additionalParamsSetter) {
        if (this.additionalParams == null) {
            this.additionalParams = new AdditionalParams();
            additionalParamsSetter.accept(this.additionalParams);
        }

        return this;
    }

    /**
     * Get additionalParams
     * @return additionalParams
     */
    public AdditionalParams getAdditionalParams() {
        return additionalParams;
    }

    public void setAdditionalParams(AdditionalParams additionalParams) {
        this.additionalParams = additionalParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInstance that = (CreateInstance) obj;
        return Objects.equals(this.instanceType, that.instanceType) && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.name, that.name) && Objects.equals(this.chargeInfo, that.chargeInfo)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.additionalParams, that.additionalParams);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(instanceType, flavor, name, chargeInfo, description, enterpriseProjectId, tags, additionalParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstance {\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    additionalParams: ").append(toIndentedString(additionalParams)).append("\n");
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
