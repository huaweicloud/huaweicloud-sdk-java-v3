package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LTSIndexConfigInfo
 */
public class LTSIndexConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fullTextIndex")

    private LTSFullTextIndexInfo fullTextIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<LTSFieldsInfo> fields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sqlAnalysisEnable")

    private Boolean sqlAnalysisEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logStreamId")

    private String logStreamId;

    public LTSIndexConfigInfo withFullTextIndex(LTSFullTextIndexInfo fullTextIndex) {
        this.fullTextIndex = fullTextIndex;
        return this;
    }

    public LTSIndexConfigInfo withFullTextIndex(Consumer<LTSFullTextIndexInfo> fullTextIndexSetter) {
        if (this.fullTextIndex == null) {
            this.fullTextIndex = new LTSFullTextIndexInfo();
            fullTextIndexSetter.accept(this.fullTextIndex);
        }

        return this;
    }

    /**
     * Get fullTextIndex
     * @return fullTextIndex
     */
    public LTSFullTextIndexInfo getFullTextIndex() {
        return fullTextIndex;
    }

    public void setFullTextIndex(LTSFullTextIndexInfo fullTextIndex) {
        this.fullTextIndex = fullTextIndex;
    }

    public LTSIndexConfigInfo withFields(List<LTSFieldsInfo> fields) {
        this.fields = fields;
        return this;
    }

    public LTSIndexConfigInfo addFieldsItem(LTSFieldsInfo fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public LTSIndexConfigInfo withFields(Consumer<List<LTSFieldsInfo>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * 字段索引配置
     * @return fields
     */
    public List<LTSFieldsInfo> getFields() {
        return fields;
    }

    public void setFields(List<LTSFieldsInfo> fields) {
        this.fields = fields;
    }

    public LTSIndexConfigInfo withSqlAnalysisEnable(Boolean sqlAnalysisEnable) {
        this.sqlAnalysisEnable = sqlAnalysisEnable;
        return this;
    }

    /**
     * 是否开启可视化
     * @return sqlAnalysisEnable
     */
    public Boolean getSqlAnalysisEnable() {
        return sqlAnalysisEnable;
    }

    public void setSqlAnalysisEnable(Boolean sqlAnalysisEnable) {
        this.sqlAnalysisEnable = sqlAnalysisEnable;
    }

    public LTSIndexConfigInfo withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /**
     * 日志流id
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LTSIndexConfigInfo that = (LTSIndexConfigInfo) obj;
        return Objects.equals(this.fullTextIndex, that.fullTextIndex) && Objects.equals(this.fields, that.fields)
            && Objects.equals(this.sqlAnalysisEnable, that.sqlAnalysisEnable)
            && Objects.equals(this.logStreamId, that.logStreamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullTextIndex, fields, sqlAnalysisEnable, logStreamId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LTSIndexConfigInfo {\n");
        sb.append("    fullTextIndex: ").append(toIndentedString(fullTextIndex)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    sqlAnalysisEnable: ").append(toIndentedString(sqlAnalysisEnable)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
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
