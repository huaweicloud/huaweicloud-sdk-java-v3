package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListCloudServersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_recycle_bin")

    private Boolean inRecycleBin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spod_id")

    private String spodId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_name")

    private String flavorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private String metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata-key")

    private String metadataKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not-tags")

    private String notTags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_eq")

    private String availabilityZoneEq;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_name")

    private String keyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "launched_since")

    private String launchedSince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expect-fields")

    private List<String> expectFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListCloudServersRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 云服务器ID，格式为UUID，匹配规则为精确匹配。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListCloudServersRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 云服务器名称，匹配规则为模糊匹配。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListCloudServersRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 云服务器状态。  取值范围：  ACTIVE， BUILD，DELETED，ERROR，HARD_REBOOT，MIGRATING，REBOOT，RESIZE，REVERT_RESIZE，SHELVED，SHELVED_OFFLOADED，SHUTOFF，UNKNOWN，VERIFY_RESIZE  弹性云服务器状态说明请参考[云服务器状态](https://support.huaweicloud.com/api-ecs/ecs_08_0002.html)
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListCloudServersRequest withInRecycleBin(Boolean inRecycleBin) {
        this.inRecycleBin = inRecycleBin;
        return this;
    }

    /**
     * 云服务器是否处于回收站中
     * @return inRecycleBin
     */
    public Boolean getInRecycleBin() {
        return inRecycleBin;
    }

    public void setInRecycleBin(Boolean inRecycleBin) {
        this.inRecycleBin = inRecycleBin;
    }

    public ListCloudServersRequest withSpodId(String spodId) {
        this.spodId = spodId;
        return this;
    }

    /**
     * 共池裸机按整机柜发放的同一批次的批创id。
     * @return spodId
     */
    public String getSpodId() {
        return spodId;
    }

    public void setSpodId(String spodId) {
        this.spodId = spodId;
    }

    public ListCloudServersRequest withFlavorName(String flavorName) {
        this.flavorName = flavorName;
        return this;
    }

    /**
     * 云服务器规格名称。
     * @return flavorName
     */
    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }

    public ListCloudServersRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像ID。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ListCloudServersRequest withMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * 元数据过滤，支持key=value过滤。
     * @return metadata
     */
    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public ListCloudServersRequest withMetadataKey(String metadataKey) {
        this.metadataKey = metadataKey;
        return this;
    }

    /**
     * 元数据key过滤。
     * @return metadataKey
     */
    public String getMetadataKey() {
        return metadataKey;
    }

    public void setMetadataKey(String metadataKey) {
        this.metadataKey = metadataKey;
    }

    public ListCloudServersRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 查询tag字段中包含该值的云服务器。
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ListCloudServersRequest withNotTags(String notTags) {
        this.notTags = notTags;
        return this;
    }

    /**
     *  查询tag字段中不包含该值的云服务器
     * @return notTags
     */
    public String getNotTags() {
        return notTags;
    }

    public void setNotTags(String notTags) {
        this.notTags = notTags;
    }

    public ListCloudServersRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 云服务器所在的AZ，匹配规则为模糊匹配。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ListCloudServersRequest withAvailabilityZoneEq(String availabilityZoneEq) {
        this.availabilityZoneEq = availabilityZoneEq;
        return this;
    }

    /**
     * 云服务器所在的AZ，匹配规则为精确匹配。
     * @return availabilityZoneEq
     */
    public String getAvailabilityZoneEq() {
        return availabilityZoneEq;
    }

    public void setAvailabilityZoneEq(String availabilityZoneEq) {
        this.availabilityZoneEq = availabilityZoneEq;
    }

    public ListCloudServersRequest withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 云服务器的计费类型。
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ListCloudServersRequest withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * 云服务器使用的密钥对名称。
     * @return keyName
     */
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public ListCloudServersRequest withLaunchedSince(String launchedSince) {
        this.launchedSince = launchedSince;
        return this;
    }

    /**
     * 过滤在launched_since时间之后启动的云服务器。格式为ISO8601时间格式，例如：2013-06-09T06:42:18Z。
     * @return launchedSince
     */
    public String getLaunchedSince() {
        return launchedSince;
    }

    public void setLaunchedSince(String launchedSince) {
        this.launchedSince = launchedSince;
    }

    public ListCloudServersRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 过滤绑定某个企业项目的云服务器。 若需要查询当前用户所有企业项目绑定的云服务，请传参all_granted_eps。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListCloudServersRequest withExpectFields(List<String> expectFields) {
        this.expectFields = expectFields;
        return this;
    }

    public ListCloudServersRequest addExpectFieldsItem(String expectFieldsItem) {
        if (this.expectFields == null) {
            this.expectFields = new ArrayList<>();
        }
        this.expectFields.add(expectFieldsItem);
        return this;
    }

    public ListCloudServersRequest withExpectFields(Consumer<List<String>> expectFieldsSetter) {
        if (this.expectFields == null) {
            this.expectFields = new ArrayList<>();
        }
        expectFieldsSetter.accept(this.expectFields);
        return this;
    }

    /**
     * 控制查询输出的字段。在默认字段的基础上选择是否查询，有管理员字段。
     * @return expectFields
     */
    public List<String> getExpectFields() {
        return expectFields;
    }

    public void setExpectFields(List<String> expectFields) {
        this.expectFields = expectFields;
    }

    public ListCloudServersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询返回VM数量限制。 limit 默认为10，最大为100。
     * minimum: 0
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCloudServersRequest that = (ListCloudServersRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.inRecycleBin, that.inRecycleBin)
            && Objects.equals(this.spodId, that.spodId) && Objects.equals(this.flavorName, that.flavorName)
            && Objects.equals(this.imageId, that.imageId) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.metadataKey, that.metadataKey) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.notTags, that.notTags)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.availabilityZoneEq, that.availabilityZoneEq)
            && Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.keyName, that.keyName)
            && Objects.equals(this.launchedSince, that.launchedSince)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.expectFields, that.expectFields) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            inRecycleBin,
            spodId,
            flavorName,
            imageId,
            metadata,
            metadataKey,
            tags,
            notTags,
            availabilityZone,
            availabilityZoneEq,
            chargingMode,
            keyName,
            launchedSince,
            enterpriseProjectId,
            expectFields,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloudServersRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    inRecycleBin: ").append(toIndentedString(inRecycleBin)).append("\n");
        sb.append("    spodId: ").append(toIndentedString(spodId)).append("\n");
        sb.append("    flavorName: ").append(toIndentedString(flavorName)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    metadataKey: ").append(toIndentedString(metadataKey)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    availabilityZoneEq: ").append(toIndentedString(availabilityZoneEq)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    launchedSince: ").append(toIndentedString(launchedSince)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    expectFields: ").append(toIndentedString(expectFields)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
