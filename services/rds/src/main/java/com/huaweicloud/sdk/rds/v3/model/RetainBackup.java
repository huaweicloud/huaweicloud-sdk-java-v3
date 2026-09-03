package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**  保留的备份  **约束限制**  不涉及  **取值范围**  不涉及  **默认取值**  不涉及
 */
public class RetainBackup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "describe")

    private String describe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_method")

    private String backupMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tde")

    private Boolean tde;

    public RetainBackup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：  备份名字  **约束限制**  不涉及  **取值范围**  不涉及  **默认取值**  不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RetainBackup withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：  备份ID  **约束限制**  不涉及  **取值范围**  不涉及  **默认取值**  不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RetainBackup withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：  备份类型。Db表示自动备份、Snapshot表示手动备份  **约束限制**  不涉及  **取值范围**  Db、Snapshot  **默认取值**  不涉及
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RetainBackup withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * **参数解释**：  备份开始时间  **约束限制**  不涉及  **取值范围**  不涉及  **默认取值**  不涉及
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public RetainBackup withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**：  备份结束时间  **约束限制**  不涉及  **取值范围**  不涉及  **默认取值**  不涉及
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public RetainBackup withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**：  备份大小  **约束限制**  不涉及  **取值范围**  不涉及  **默认取值**  不涉及
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public RetainBackup withDescribe(String describe) {
        this.describe = describe;
        return this;
    }

    /**
     * **参数解释**：  备份描述信息  **约束限制**  不涉及  **取值范围**  不涉及  **默认取值**  不涉及
     * @return describe
     */
    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public RetainBackup withBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
        return this;
    }

    /**
     * **参数解释**：  备份方式。Physics表示物理备份、Snapshot表示快照备份  **约束限制**  不涉及  **取值范围**  Physics、Snapshot  **默认取值**  不涉及
     * @return backupMethod
     */
    public String getBackupMethod() {
        return backupMethod;
    }

    public void setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
    }

    public RetainBackup withTde(Boolean tde) {
        this.tde = tde;
        return this;
    }

    /**
     * **参数解释**：  备份是否tde加密  **约束限制**  不涉及  **取值范围**  false、true  **默认取值**  不涉及
     * @return tde
     */
    public Boolean getTde() {
        return tde;
    }

    public void setTde(Boolean tde) {
        this.tde = tde;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetainBackup that = (RetainBackup) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.id, that.id)
            && Objects.equals(this.type, that.type) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.size, that.size)
            && Objects.equals(this.describe, that.describe) && Objects.equals(this.backupMethod, that.backupMethod)
            && Objects.equals(this.tde, that.tde);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, type, beginTime, endTime, size, describe, backupMethod, tde);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetainBackup {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    describe: ").append(toIndentedString(describe)).append("\n");
        sb.append("    backupMethod: ").append(toIndentedString(backupMethod)).append("\n");
        sb.append("    tde: ").append(toIndentedString(tde)).append("\n");
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
