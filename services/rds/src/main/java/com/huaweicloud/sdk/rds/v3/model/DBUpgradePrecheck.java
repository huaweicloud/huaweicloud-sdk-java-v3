package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据库检查结果
 */
public class DBUpgradePrecheck {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Integer result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checks_performed")

    private List<DBCheckDetail> checksPerformed = null;

    public DBUpgradePrecheck withResult(Integer result) {
        this.result = result;
        return this;
    }

    /**
     * 检查是否通过，0代表通过，1代表未通过
     * minimum: 1
     * maximum: 10
     * @return result
     */
    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public DBUpgradePrecheck withChecksPerformed(List<DBCheckDetail> checksPerformed) {
        this.checksPerformed = checksPerformed;
        return this;
    }

    public DBUpgradePrecheck addChecksPerformedItem(DBCheckDetail checksPerformedItem) {
        if (this.checksPerformed == null) {
            this.checksPerformed = new ArrayList<>();
        }
        this.checksPerformed.add(checksPerformedItem);
        return this;
    }

    public DBUpgradePrecheck withChecksPerformed(Consumer<List<DBCheckDetail>> checksPerformedSetter) {
        if (this.checksPerformed == null) {
            this.checksPerformed = new ArrayList<>();
        }
        checksPerformedSetter.accept(this.checksPerformed);
        return this;
    }

    /**
     * 检查项
     * @return checksPerformed
     */
    public List<DBCheckDetail> getChecksPerformed() {
        return checksPerformed;
    }

    public void setChecksPerformed(List<DBCheckDetail> checksPerformed) {
        this.checksPerformed = checksPerformed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DBUpgradePrecheck that = (DBUpgradePrecheck) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.checksPerformed, that.checksPerformed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, checksPerformed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DBUpgradePrecheck {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    checksPerformed: ").append(toIndentedString(checksPerformed)).append("\n");
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
