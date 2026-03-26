package com.huaweicloud.sdk.dwr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListCollectionDetails
 */
public class ListCollectionDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collection_name")

    private String collectionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_num")

    private Integer indexNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_num")

    private Long entityNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "load_state")

    private String loadState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ListCollectionDetails withCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    /**
     * **参数解释：** collection名称。 **约束限制：** 可包含数字、字母和下划线 ( _ )。资源名称必须以字母或下划线 ( _ ) 开头。最大长度支持255。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return collectionName
     */
    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public ListCollectionDetails withIndexNum(Integer indexNum) {
        this.indexNum = indexNum;
        return this;
    }

    /**
     * **参数解释：** 索引数量。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return indexNum
     */
    public Integer getIndexNum() {
        return indexNum;
    }

    public void setIndexNum(Integer indexNum) {
        this.indexNum = indexNum;
    }

    public ListCollectionDetails withEntityNum(Long entityNum) {
        this.entityNum = entityNum;
        return this;
    }

    /**
     * **参数解释：** collection中的entity数量。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return entityNum
     */
    public Long getEntityNum() {
        return entityNum;
    }

    public void setEntityNum(Long entityNum) {
        this.entityNum = entityNum;
    }

    public ListCollectionDetails withLoadState(String loadState) {
        this.loadState = loadState;
        return this;
    }

    /**
     * **参数解释：** 标识当前Collection加载状态。 **约束限制：** 不涉及。 **取值范围：** 1、LoadStateLoaded：表示当前Collection已准备就绪，可正常使用。 2、LoadStateLoading：表示当前Collection正在load。 3、LoadStateNotLoad：表示collection未加载。 **默认取值:** 不涉及。
     * @return loadState
     */
    public String getLoadState() {
        return loadState;
    }

    public void setLoadState(String loadState) {
        this.loadState = loadState;
    }

    public ListCollectionDetails withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **约束限制：** 格式为“yyyy-mm-ddThh:mm:ssZ\"。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ListCollectionDetails withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** collection的描述信息。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCollectionDetails that = (ListCollectionDetails) obj;
        return Objects.equals(this.collectionName, that.collectionName) && Objects.equals(this.indexNum, that.indexNum)
            && Objects.equals(this.entityNum, that.entityNum) && Objects.equals(this.loadState, that.loadState)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectionName, indexNum, entityNum, loadState, createTime, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCollectionDetails {\n");
        sb.append("    collectionName: ").append(toIndentedString(collectionName)).append("\n");
        sb.append("    indexNum: ").append(toIndentedString(indexNum)).append("\n");
        sb.append("    entityNum: ").append(toIndentedString(entityNum)).append("\n");
        sb.append("    loadState: ").append(toIndentedString(loadState)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
