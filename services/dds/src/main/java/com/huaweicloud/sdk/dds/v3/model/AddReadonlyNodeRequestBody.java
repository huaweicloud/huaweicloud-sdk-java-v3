package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AddReadonlyNodeRequestBody
 */
public class AddReadonlyNodeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Integer num;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private Integer delay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private Boolean isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    public AddReadonlyNodeRequestBody withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * **参数解释：** 资源规格编码。获取方法请参见查询数据库规格中参数的值。示例：dds.mongodb.c6.large.4.rr。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public AddReadonlyNodeRequestBody withNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * **参数解释：** 待新增只读节点个数。 **约束限制：** 不涉及。 **取值范围：** [1, 5]。 **默认取值：** 不涉及。
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public AddReadonlyNodeRequestBody withDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    /**
     * **参数解释：** 同步延迟时间。 **约束限制：** 集群不支持设置。 **取值范围：** 0~1200秒。 **默认取值：** 不涉及。
     * @return delay
     */
    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    public AddReadonlyNodeRequestBody withIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * **参数解释：** 新增包年包月实例的只读节点时可指定，表示是否自动从账户中支付，此字段不影响自动续订的支付方式。 **约束限制：** 不涉及。 **取值范围：** - true，表示自动从账户中支付。 - false，表示手动从账户中支付，默认为该方式。 **默认取值：** false。
     * @return isAutoPay
     */
    public Boolean getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public AddReadonlyNodeRequestBody withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释：** 目标Shard组ID。集群实例添加只读节点时传入目标Shard组ID。 **约束限制：** 副本集实例不支持设置。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public AddReadonlyNodeRequestBody withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * **参数解释：** 新增只读节点的可用区ID。可根据“查询实例列表和详情”接口响应参数获取。 **约束限制：** 该参数仅对多可用区部署的实例生效。仅支持传入一个可用区且必须属于当前实例的多个可用区内的其中一个。 **取值范围：** 不涉及。 **默认取值：** 若不传此参数，新增的只读节点将相对均匀分布在主备节点所在可用区。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddReadonlyNodeRequestBody that = (AddReadonlyNodeRequestBody) obj;
        return Objects.equals(this.specCode, that.specCode) && Objects.equals(this.num, that.num)
            && Objects.equals(this.delay, that.delay) && Objects.equals(this.isAutoPay, that.isAutoPay)
            && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.availabilityZone, that.availabilityZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specCode, num, delay, isAutoPay, groupId, availabilityZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddReadonlyNodeRequestBody {\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
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
