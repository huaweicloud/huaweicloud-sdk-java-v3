package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteAddressSetsDto
 */
public class BatchDeleteAddressSetsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "set_ids")

    private List<String> setIds = null;

    public BatchDeleteAddressSetsDto withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * **参数解释**： 防护对象ID，是创建云防火墙后用于区分互联网边界防护和VPC边界防护的标志id，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)获得，通过返回值中的data.records.protect_objects.object_id（.表示各对象之间层级的区分）获得，注意type为0的为互联网边界防护对象id，type为1的为VPC边界防护对象id。 **约束限制**： 不涉及 **取值范围**： 32位UUID **默认取值**： 不涉及
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public BatchDeleteAddressSetsDto withSetIds(List<String> setIds) {
        this.setIds = setIds;
        return this;
    }

    public BatchDeleteAddressSetsDto addSetIdsItem(String setIdsItem) {
        if (this.setIds == null) {
            this.setIds = new ArrayList<>();
        }
        this.setIds.add(setIdsItem);
        return this;
    }

    public BatchDeleteAddressSetsDto withSetIds(Consumer<List<String>> setIdsSetter) {
        if (this.setIds == null) {
            this.setIds = new ArrayList<>();
        }
        setIdsSetter.accept(this.setIds);
        return this;
    }

    /**
     * **参数解释**： 地址组ID，可以通过调用[查询地址组列表接口]获得，通过返回值中的data.records.set_id获得 **约束限制**： 不涉及 **取值范围**： 32位UUID **默认取值**： 不涉及
     * @return setIds
     */
    public List<String> getSetIds() {
        return setIds;
    }

    public void setSetIds(List<String> setIds) {
        this.setIds = setIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteAddressSetsDto that = (BatchDeleteAddressSetsDto) obj;
        return Objects.equals(this.objectId, that.objectId) && Objects.equals(this.setIds, that.setIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, setIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteAddressSetsDto {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    setIds: ").append(toIndentedString(setIds)).append("\n");
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
