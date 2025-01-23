package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建ClickHouse实例请求体。
 */
public class CreateChInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private ClickHouseEngineInfo engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha")

    private CreateChInstanceRequestBodyHa ha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_root_pwd")

    private String dbRootPwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_mode")

    private String azMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private CreateChInstanceRequestBodyVolume volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code")

    private String azCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_info")

    private CreateChInstanceRequestBodyTagsInfo tagsInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pay_info")

    private CreateChInstanceRequestBodyPayInfo payInfo;

    public CreateChInstanceRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * ClickHouse实例名称。 - 4位到64位之间 - 必须以字母开头，可以包含字母、数字、中划线或下划线 - 不能包含其他特殊字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateChInstanceRequestBody withEngine(ClickHouseEngineInfo engine) {
        this.engine = engine;
        return this;
    }

    public CreateChInstanceRequestBody withEngine(Consumer<ClickHouseEngineInfo> engineSetter) {
        if (this.engine == null) {
            this.engine = new ClickHouseEngineInfo();
            engineSetter.accept(this.engine);
        }

        return this;
    }

    /**
     * Get engine
     * @return engine
     */
    public ClickHouseEngineInfo getEngine() {
        return engine;
    }

    public void setEngine(ClickHouseEngineInfo engine) {
        this.engine = engine;
    }

    public CreateChInstanceRequestBody withHa(CreateChInstanceRequestBodyHa ha) {
        this.ha = ha;
        return this;
    }

    public CreateChInstanceRequestBody withHa(Consumer<CreateChInstanceRequestBodyHa> haSetter) {
        if (this.ha == null) {
            this.ha = new CreateChInstanceRequestBodyHa();
            haSetter.accept(this.ha);
        }

        return this;
    }

    /**
     * Get ha
     * @return ha
     */
    public CreateChInstanceRequestBodyHa getHa() {
        return ha;
    }

    public void setHa(CreateChInstanceRequestBodyHa ha) {
        this.ha = ha;
    }

    public CreateChInstanceRequestBody withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 节点规格ID，可通过“HTAP查询规格信息”获取。
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public CreateChInstanceRequestBody withDbRootPwd(String dbRootPwd) {
        this.dbRootPwd = dbRootPwd;
        return this;
    }

    /**
     * root账户密码。 - 8~32个字符 - 包含大写字母、小写字母、数字或特殊字符(~ ! @ # % ^ * - _ = + ? ,)中的三种
     * @return dbRootPwd
     */
    public String getDbRootPwd() {
        return dbRootPwd;
    }

    public void setDbRootPwd(String dbRootPwd) {
        this.dbRootPwd = dbRootPwd;
    }

    public CreateChInstanceRequestBody withAzMode(String azMode) {
        this.azMode = azMode;
        return this;
    }

    /**
     * 可用区类型。 取值范围： - single：单可用区 - double：多可用区
     * @return azMode
     */
    public String getAzMode() {
        return azMode;
    }

    public void setAzMode(String azMode) {
        this.azMode = azMode;
    }

    public CreateChInstanceRequestBody withVolume(CreateChInstanceRequestBodyVolume volume) {
        this.volume = volume;
        return this;
    }

    public CreateChInstanceRequestBody withVolume(Consumer<CreateChInstanceRequestBodyVolume> volumeSetter) {
        if (this.volume == null) {
            this.volume = new CreateChInstanceRequestBodyVolume();
            volumeSetter.accept(this.volume);
        }

        return this;
    }

    /**
     * Get volume
     * @return volume
     */
    public CreateChInstanceRequestBodyVolume getVolume() {
        return volume;
    }

    public void setVolume(CreateChInstanceRequestBodyVolume volume) {
        this.volume = volume;
    }

    public CreateChInstanceRequestBody withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /**
     * 可用区码。  当ha中mode为Ha时，需要填写多个可用区，用\",\" 分隔。例如：cn-southwest-244b,cn-southwest-244a
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    public CreateChInstanceRequestBody withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区。默认为所属TaurusDB实例时区。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public CreateChInstanceRequestBody withTagsInfo(CreateChInstanceRequestBodyTagsInfo tagsInfo) {
        this.tagsInfo = tagsInfo;
        return this;
    }

    public CreateChInstanceRequestBody withTagsInfo(Consumer<CreateChInstanceRequestBodyTagsInfo> tagsInfoSetter) {
        if (this.tagsInfo == null) {
            this.tagsInfo = new CreateChInstanceRequestBodyTagsInfo();
            tagsInfoSetter.accept(this.tagsInfo);
        }

        return this;
    }

    /**
     * Get tagsInfo
     * @return tagsInfo
     */
    public CreateChInstanceRequestBodyTagsInfo getTagsInfo() {
        return tagsInfo;
    }

    public void setTagsInfo(CreateChInstanceRequestBodyTagsInfo tagsInfo) {
        this.tagsInfo = tagsInfo;
    }

    public CreateChInstanceRequestBody withPayInfo(CreateChInstanceRequestBodyPayInfo payInfo) {
        this.payInfo = payInfo;
        return this;
    }

    public CreateChInstanceRequestBody withPayInfo(Consumer<CreateChInstanceRequestBodyPayInfo> payInfoSetter) {
        if (this.payInfo == null) {
            this.payInfo = new CreateChInstanceRequestBodyPayInfo();
            payInfoSetter.accept(this.payInfo);
        }

        return this;
    }

    /**
     * Get payInfo
     * @return payInfo
     */
    public CreateChInstanceRequestBodyPayInfo getPayInfo() {
        return payInfo;
    }

    public void setPayInfo(CreateChInstanceRequestBodyPayInfo payInfo) {
        this.payInfo = payInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateChInstanceRequestBody that = (CreateChInstanceRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.engine, that.engine)
            && Objects.equals(this.ha, that.ha) && Objects.equals(this.flavorId, that.flavorId)
            && Objects.equals(this.dbRootPwd, that.dbRootPwd) && Objects.equals(this.azMode, that.azMode)
            && Objects.equals(this.volume, that.volume) && Objects.equals(this.azCode, that.azCode)
            && Objects.equals(this.timeZone, that.timeZone) && Objects.equals(this.tagsInfo, that.tagsInfo)
            && Objects.equals(this.payInfo, that.payInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, engine, ha, flavorId, dbRootPwd, azMode, volume, azCode, timeZone, tagsInfo, payInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateChInstanceRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    dbRootPwd: ").append(toIndentedString(dbRootPwd)).append("\n");
        sb.append("    azMode: ").append(toIndentedString(azMode)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    tagsInfo: ").append(toIndentedString(tagsInfo)).append("\n");
        sb.append("    payInfo: ").append(toIndentedString(payInfo)).append("\n");
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
