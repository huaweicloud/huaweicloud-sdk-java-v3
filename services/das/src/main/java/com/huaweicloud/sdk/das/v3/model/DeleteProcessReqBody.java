package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteProcessReqBody
 */
public class DeleteProcessReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_user_id")

    @JacksonXmlProperty(localName = "db_user_id")

    private String dbUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_ids")

    @JacksonXmlProperty(localName = "process_ids")

    private List<String> processIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    @JacksonXmlProperty(localName = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    @JacksonXmlProperty(localName = "database")

    private String database;

    public DeleteProcessReqBody withDbUserId(String dbUserId) {
        this.dbUserId = dbUserId;
        return this;
    }

    /**
     * 数据库用户ID
     * @return dbUserId
     */
    public String getDbUserId() {
        return dbUserId;
    }

    public void setDbUserId(String dbUserId) {
        this.dbUserId = dbUserId;
    }

    public DeleteProcessReqBody withProcessIds(List<String> processIds) {
        this.processIds = processIds;
        return this;
    }

    public DeleteProcessReqBody addProcessIdsItem(String processIdsItem) {
        if (this.processIds == null) {
            this.processIds = new ArrayList<>();
        }
        this.processIds.add(processIdsItem);
        return this;
    }

    public DeleteProcessReqBody withProcessIds(Consumer<List<String>> processIdsSetter) {
        if (this.processIds == null) {
            this.processIds = new ArrayList<>();
        }
        processIdsSetter.accept(this.processIds);
        return this;
    }

    /**
     * 会话ID列表。process_ids、user、database至少指定一个参数。
     * @return processIds
     */
    public List<String> getProcessIds() {
        return processIds;
    }

    public void setProcessIds(List<String> processIds) {
        this.processIds = processIds;
    }

    public DeleteProcessReqBody withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 用户
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public DeleteProcessReqBody withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 数据库名称
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteProcessReqBody deleteProcessReqBody = (DeleteProcessReqBody) o;
        return Objects.equals(this.dbUserId, deleteProcessReqBody.dbUserId)
            && Objects.equals(this.processIds, deleteProcessReqBody.processIds)
            && Objects.equals(this.user, deleteProcessReqBody.user)
            && Objects.equals(this.database, deleteProcessReqBody.database);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbUserId, processIds, user, database);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteProcessReqBody {\n");
        sb.append("    dbUserId: ").append(toIndentedString(dbUserId)).append("\n");
        sb.append("    processIds: ").append(toIndentedString(processIds)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
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
