package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowStarRocksDatabaseUsersUserDetails
 */
public class ShowStarRocksDatabaseUsersUserDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_bases")

    private List<String> dataBases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dml")

    private Integer dml;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddl")

    private Integer ddl;

    public ShowStarRocksDatabaseUsersUserDetails withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 数据库账户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ShowStarRocksDatabaseUsersUserDetails withDataBases(List<String> dataBases) {
        this.dataBases = dataBases;
        return this;
    }

    public ShowStarRocksDatabaseUsersUserDetails addDataBasesItem(String dataBasesItem) {
        if (this.dataBases == null) {
            this.dataBases = new ArrayList<>();
        }
        this.dataBases.add(dataBasesItem);
        return this;
    }

    public ShowStarRocksDatabaseUsersUserDetails withDataBases(Consumer<List<String>> dataBasesSetter) {
        if (this.dataBases == null) {
            this.dataBases = new ArrayList<>();
        }
        dataBasesSetter.accept(this.dataBases);
        return this;
    }

    /**
     * 已授权数据库。
     * @return dataBases
     */
    public List<String> getDataBases() {
        return dataBases;
    }

    public void setDataBases(List<String> dataBases) {
        this.dataBases = dataBases;
    }

    public ShowStarRocksDatabaseUsersUserDetails withDml(Integer dml) {
        this.dml = dml;
        return this;
    }

    /**
     * DML授权。 - 0：读写权限 - 1：只读权限 - 2：只读和设置权限 - 3：读写和设置权限
     * @return dml
     */
    public Integer getDml() {
        return dml;
    }

    public void setDml(Integer dml) {
        this.dml = dml;
    }

    public ShowStarRocksDatabaseUsersUserDetails withDdl(Integer ddl) {
        this.ddl = ddl;
        return this;
    }

    /**
     * DDL授权。 - 0：无DDL权限 - 1：有DDL权限
     * @return ddl
     */
    public Integer getDdl() {
        return ddl;
    }

    public void setDdl(Integer ddl) {
        this.ddl = ddl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStarRocksDatabaseUsersUserDetails that = (ShowStarRocksDatabaseUsersUserDetails) obj;
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.dataBases, that.dataBases)
            && Objects.equals(this.dml, that.dml) && Objects.equals(this.ddl, that.ddl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, dataBases, dml, ddl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStarRocksDatabaseUsersUserDetails {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    dataBases: ").append(toIndentedString(dataBases)).append("\n");
        sb.append("    dml: ").append(toIndentedString(dml)).append("\n");
        sb.append("    ddl: ").append(toIndentedString(ddl)).append("\n");
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
