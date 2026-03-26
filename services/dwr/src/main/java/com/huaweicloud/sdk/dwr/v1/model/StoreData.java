package com.huaweicloud.sdk.dwr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StoreData
 */
public class StoreData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_name")

    private String storeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zones")

    private List<String> availabilityZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private Flavor flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_info")

    private ChargeInfo chargeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_link")

    private String privateLink;

    public StoreData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 知识仓实例id。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StoreData withStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    /**
     * **参数解释：** 知识仓实例名称，region内唯一。 **约束限制：** 长度范围为3到63个字符，支持小写字母、数字、中划线（-），第一个字符只能够是小写字母，中划线(-)不得出现在字符串末尾。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return storeName
     */
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public StoreData withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 知识仓实例状态。 **约束限制：** 不涉及。 **取值范围：** CREATING：创建中 NORMAL：正常 CREATED_FAILED：创建失败 ABNORMAL：异常 FROZEN：冻结 DISK_FULL：存储空间已满 DELETING：删除中 DELETE_FAILED：删除失败 SCALING：扩容中 **默认取值:** 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StoreData withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **约束限制：** 格式为“yyyy-mm-ddThh:mm:ssZ”。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public StoreData withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释：** 区域ID。 **约束限制**： 不涉及。 **取值范围：** 取值：非空，请参见地区和终端节点。 **默认取值:** 不涉及。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public StoreData withAvailabilityZones(List<String> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    public StoreData addAvailabilityZonesItem(String availabilityZonesItem) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new ArrayList<>();
        }
        this.availabilityZones.add(availabilityZonesItem);
        return this;
    }

    public StoreData withAvailabilityZones(Consumer<List<String>> availabilityZonesSetter) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new ArrayList<>();
        }
        availabilityZonesSetter.accept(this.availabilityZones);
        return this;
    }

    /**
     * **参数解释：** 可用区ID列表，支持1个，或者多个。 **约束限制：** 不涉及。
     * @return availabilityZones
     */
    public List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    public void setAvailabilityZones(List<String> availabilityZones) {
        this.availabilityZones = availabilityZones;
    }

    public StoreData withFlavor(Flavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public StoreData withFlavor(Consumer<Flavor> flavorSetter) {
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

    public StoreData withChargeInfo(ChargeInfo chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public StoreData withChargeInfo(Consumer<ChargeInfo> chargeInfoSetter) {
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

    public StoreData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 知识仓实例描述信息。 **约束限制：** 有效长度0-255  **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StoreData withPrivateLink(String privateLink) {
        this.privateLink = privateLink;
        return this;
    }

    /**
     * **参数解释：** 知识仓实例的私网链接信息，参考\"VPCEP终端节点对接LMS知识仓实例\"。 **约束限制：** 当前不支持公网访问。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return privateLink
     */
    public String getPrivateLink() {
        return privateLink;
    }

    public void setPrivateLink(String privateLink) {
        this.privateLink = privateLink;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StoreData that = (StoreData) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.storeName, that.storeName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.region, that.region)
            && Objects.equals(this.availabilityZones, that.availabilityZones)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.chargeInfo, that.chargeInfo)
            && Objects.equals(this.description, that.description) && Objects.equals(this.privateLink, that.privateLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            storeName,
            status,
            createTime,
            region,
            availabilityZones,
            flavor,
            chargeInfo,
            description,
            privateLink);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StoreData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    privateLink: ").append(toIndentedString(privateLink)).append("\n");
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
