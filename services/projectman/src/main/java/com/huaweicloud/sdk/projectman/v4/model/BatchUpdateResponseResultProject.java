package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 项目。 **取值范围：** 不涉及。
 */
public class BatchUpdateResponseResultProject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier")

    private String identifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close")

    private Integer close;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private Integer role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archive")

    private Boolean archive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_count")

    private Integer memCount;

    public BatchUpdateResponseResultProject withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 项目数字id。 **取值范围：** 不涉及。
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BatchUpdateResponseResultProject withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * **参数解释：** 项目uuid。 **取值范围：** 不涉及。
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public BatchUpdateResponseResultProject withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 批量编辑工作项的总数。 **取值范围：** 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public BatchUpdateResponseResultProject withClose(Integer close) {
        this.close = close;
        return this;
    }

    /**
     * **参数解释：** 项目是否关闭。 **取值范围：** 0（打开） 1（关闭）
     * @return close
     */
    public Integer getClose() {
        return close;
    }

    public void setClose(Integer close) {
        this.close = close;
    }

    public BatchUpdateResponseResultProject withRole(Integer role) {
        this.role = role;
        return this;
    }

    /**
     * **参数解释：** 批量编辑数量。 **取值范围：** 不涉及。
     * @return role
     */
    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public BatchUpdateResponseResultProject withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 工作项类型。 **取值范围：** scrum。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BatchUpdateResponseResultProject withArchive(Boolean archive) {
        this.archive = archive;
        return this;
    }

    /**
     * **参数解释：** 工作项是否归档。 **取值范围：** true(归档) false(未归档)
     * @return archive
     */
    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    public BatchUpdateResponseResultProject withMemCount(Integer memCount) {
        this.memCount = memCount;
        return this;
    }

    /**
     * **参数解释：** 项目数量。 **取值范围：** 不涉及。
     * @return memCount
     */
    public Integer getMemCount() {
        return memCount;
    }

    public void setMemCount(Integer memCount) {
        this.memCount = memCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateResponseResultProject that = (BatchUpdateResponseResultProject) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.identifier, that.identifier)
            && Objects.equals(this.total, that.total) && Objects.equals(this.close, that.close)
            && Objects.equals(this.role, that.role) && Objects.equals(this.type, that.type)
            && Objects.equals(this.archive, that.archive) && Objects.equals(this.memCount, that.memCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, identifier, total, close, role, type, archive, memCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateResponseResultProject {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    close: ").append(toIndentedString(close)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
        sb.append("    memCount: ").append(toIndentedString(memCount)).append("\n");
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
