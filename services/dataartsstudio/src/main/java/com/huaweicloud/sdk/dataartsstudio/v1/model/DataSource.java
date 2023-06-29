package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DataSource
 */
public class DataSource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_name")

    private String datasourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_type")

    private String datasourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_guid")

    private String datasourceGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_qualified_name")

    private String datasourceQualifiedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_folder_count")

    private Integer obsFolderCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_file_count")

    private Integer obsFileCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "css_index_count")

    private Integer cssIndexCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "css_index_field_count")

    private Integer cssIndexFieldCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_count")

    private Integer namespaceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ges_vertex_count")

    private Integer gesVertexCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ges_edge_count")

    private Integer gesEdgeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_count")

    private Integer databaseCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_count")

    private Integer streamCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_count")

    private Integer tableCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_size")

    private Integer dataSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<Database> databases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folders")

    private List<ObsFolder> folders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "css_indices")

    private List<CssIndex> cssIndices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespaces")

    private List<Namespace> namespaces = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dis_streams")

    private List<DisStream> disStreams = null;

    public DataSource withDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
        return this;
    }

    /**
     * 数据连接名称
     * @return datasourceName
     */
    public String getDatasourceName() {
        return datasourceName;
    }

    public void setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
    }

    public DataSource withDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }

    /**
     * 数据连接类型
     * @return datasourceType
     */
    public String getDatasourceType() {
        return datasourceType;
    }

    public void setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
    }

    public DataSource withDatasourceGuid(String datasourceGuid) {
        this.datasourceGuid = datasourceGuid;
        return this;
    }

    /**
     * 数据连接guid
     * @return datasourceGuid
     */
    public String getDatasourceGuid() {
        return datasourceGuid;
    }

    public void setDatasourceGuid(String datasourceGuid) {
        this.datasourceGuid = datasourceGuid;
    }

    public DataSource withDatasourceQualifiedName(String datasourceQualifiedName) {
        this.datasourceQualifiedName = datasourceQualifiedName;
        return this;
    }

    /**
     * 数据连接唯一标识名称
     * @return datasourceQualifiedName
     */
    public String getDatasourceQualifiedName() {
        return datasourceQualifiedName;
    }

    public void setDatasourceQualifiedName(String datasourceQualifiedName) {
        this.datasourceQualifiedName = datasourceQualifiedName;
    }

    public DataSource withObsFolderCount(Integer obsFolderCount) {
        this.obsFolderCount = obsFolderCount;
        return this;
    }

    /**
     * obs目录数
     * @return obsFolderCount
     */
    public Integer getObsFolderCount() {
        return obsFolderCount;
    }

    public void setObsFolderCount(Integer obsFolderCount) {
        this.obsFolderCount = obsFolderCount;
    }

    public DataSource withObsFileCount(Integer obsFileCount) {
        this.obsFileCount = obsFileCount;
        return this;
    }

    /**
     * obs文件数
     * @return obsFileCount
     */
    public Integer getObsFileCount() {
        return obsFileCount;
    }

    public void setObsFileCount(Integer obsFileCount) {
        this.obsFileCount = obsFileCount;
    }

    public DataSource withCssIndexCount(Integer cssIndexCount) {
        this.cssIndexCount = cssIndexCount;
        return this;
    }

    /**
     * css索引数
     * @return cssIndexCount
     */
    public Integer getCssIndexCount() {
        return cssIndexCount;
    }

    public void setCssIndexCount(Integer cssIndexCount) {
        this.cssIndexCount = cssIndexCount;
    }

    public DataSource withCssIndexFieldCount(Integer cssIndexFieldCount) {
        this.cssIndexFieldCount = cssIndexFieldCount;
        return this;
    }

    /**
     * css 索引字段数目
     * @return cssIndexFieldCount
     */
    public Integer getCssIndexFieldCount() {
        return cssIndexFieldCount;
    }

    public void setCssIndexFieldCount(Integer cssIndexFieldCount) {
        this.cssIndexFieldCount = cssIndexFieldCount;
    }

    public DataSource withNamespaceCount(Integer namespaceCount) {
        this.namespaceCount = namespaceCount;
        return this;
    }

    /**
     * 命名空间数
     * @return namespaceCount
     */
    public Integer getNamespaceCount() {
        return namespaceCount;
    }

    public void setNamespaceCount(Integer namespaceCount) {
        this.namespaceCount = namespaceCount;
    }

    public DataSource withGesVertexCount(Integer gesVertexCount) {
        this.gesVertexCount = gesVertexCount;
        return this;
    }

    /**
     * ges点的总数
     * @return gesVertexCount
     */
    public Integer getGesVertexCount() {
        return gesVertexCount;
    }

    public void setGesVertexCount(Integer gesVertexCount) {
        this.gesVertexCount = gesVertexCount;
    }

    public DataSource withGesEdgeCount(Integer gesEdgeCount) {
        this.gesEdgeCount = gesEdgeCount;
        return this;
    }

    /**
     * ges边的总数
     * @return gesEdgeCount
     */
    public Integer getGesEdgeCount() {
        return gesEdgeCount;
    }

    public void setGesEdgeCount(Integer gesEdgeCount) {
        this.gesEdgeCount = gesEdgeCount;
    }

    public DataSource withDatabaseCount(Integer databaseCount) {
        this.databaseCount = databaseCount;
        return this;
    }

    /**
     * 数据库总数
     * @return databaseCount
     */
    public Integer getDatabaseCount() {
        return databaseCount;
    }

    public void setDatabaseCount(Integer databaseCount) {
        this.databaseCount = databaseCount;
    }

    public DataSource withStreamCount(Integer streamCount) {
        this.streamCount = streamCount;
        return this;
    }

    /**
     * 通道总数
     * @return streamCount
     */
    public Integer getStreamCount() {
        return streamCount;
    }

    public void setStreamCount(Integer streamCount) {
        this.streamCount = streamCount;
    }

    public DataSource withTableCount(Integer tableCount) {
        this.tableCount = tableCount;
        return this;
    }

    /**
     * 表总数
     * @return tableCount
     */
    public Integer getTableCount() {
        return tableCount;
    }

    public void setTableCount(Integer tableCount) {
        this.tableCount = tableCount;
    }

    public DataSource withDataSize(Integer dataSize) {
        this.dataSize = dataSize;
        return this;
    }

    /**
     * 数据大小
     * @return dataSize
     */
    public Integer getDataSize() {
        return dataSize;
    }

    public void setDataSize(Integer dataSize) {
        this.dataSize = dataSize;
    }

    public DataSource withDatabases(List<Database> databases) {
        this.databases = databases;
        return this;
    }

    public DataSource addDatabasesItem(Database databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public DataSource withDatabases(Consumer<List<Database>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 数据库统计信息
     * @return databases
     */
    public List<Database> getDatabases() {
        return databases;
    }

    public void setDatabases(List<Database> databases) {
        this.databases = databases;
    }

    public DataSource withFolders(List<ObsFolder> folders) {
        this.folders = folders;
        return this;
    }

    public DataSource addFoldersItem(ObsFolder foldersItem) {
        if (this.folders == null) {
            this.folders = new ArrayList<>();
        }
        this.folders.add(foldersItem);
        return this;
    }

    public DataSource withFolders(Consumer<List<ObsFolder>> foldersSetter) {
        if (this.folders == null) {
            this.folders = new ArrayList<>();
        }
        foldersSetter.accept(this.folders);
        return this;
    }

    /**
     * 顶层目录统计信息
     * @return folders
     */
    public List<ObsFolder> getFolders() {
        return folders;
    }

    public void setFolders(List<ObsFolder> folders) {
        this.folders = folders;
    }

    public DataSource withCssIndices(List<CssIndex> cssIndices) {
        this.cssIndices = cssIndices;
        return this;
    }

    public DataSource addCssIndicesItem(CssIndex cssIndicesItem) {
        if (this.cssIndices == null) {
            this.cssIndices = new ArrayList<>();
        }
        this.cssIndices.add(cssIndicesItem);
        return this;
    }

    public DataSource withCssIndices(Consumer<List<CssIndex>> cssIndicesSetter) {
        if (this.cssIndices == null) {
            this.cssIndices = new ArrayList<>();
        }
        cssIndicesSetter.accept(this.cssIndices);
        return this;
    }

    /**
     * css索引统计信息
     * @return cssIndices
     */
    public List<CssIndex> getCssIndices() {
        return cssIndices;
    }

    public void setCssIndices(List<CssIndex> cssIndices) {
        this.cssIndices = cssIndices;
    }

    public DataSource withNamespaces(List<Namespace> namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    public DataSource addNamespacesItem(Namespace namespacesItem) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<>();
        }
        this.namespaces.add(namespacesItem);
        return this;
    }

    public DataSource withNamespaces(Consumer<List<Namespace>> namespacesSetter) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<>();
        }
        namespacesSetter.accept(this.namespaces);
        return this;
    }

    /**
     * 命名空间统计信息
     * @return namespaces
     */
    public List<Namespace> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(List<Namespace> namespaces) {
        this.namespaces = namespaces;
    }

    public DataSource withDisStreams(List<DisStream> disStreams) {
        this.disStreams = disStreams;
        return this;
    }

    public DataSource addDisStreamsItem(DisStream disStreamsItem) {
        if (this.disStreams == null) {
            this.disStreams = new ArrayList<>();
        }
        this.disStreams.add(disStreamsItem);
        return this;
    }

    public DataSource withDisStreams(Consumer<List<DisStream>> disStreamsSetter) {
        if (this.disStreams == null) {
            this.disStreams = new ArrayList<>();
        }
        disStreamsSetter.accept(this.disStreams);
        return this;
    }

    /**
     * 通道统计信息
     * @return disStreams
     */
    public List<DisStream> getDisStreams() {
        return disStreams;
    }

    public void setDisStreams(List<DisStream> disStreams) {
        this.disStreams = disStreams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataSource that = (DataSource) obj;
        return Objects.equals(this.datasourceName, that.datasourceName)
            && Objects.equals(this.datasourceType, that.datasourceType)
            && Objects.equals(this.datasourceGuid, that.datasourceGuid)
            && Objects.equals(this.datasourceQualifiedName, that.datasourceQualifiedName)
            && Objects.equals(this.obsFolderCount, that.obsFolderCount)
            && Objects.equals(this.obsFileCount, that.obsFileCount)
            && Objects.equals(this.cssIndexCount, that.cssIndexCount)
            && Objects.equals(this.cssIndexFieldCount, that.cssIndexFieldCount)
            && Objects.equals(this.namespaceCount, that.namespaceCount)
            && Objects.equals(this.gesVertexCount, that.gesVertexCount)
            && Objects.equals(this.gesEdgeCount, that.gesEdgeCount)
            && Objects.equals(this.databaseCount, that.databaseCount)
            && Objects.equals(this.streamCount, that.streamCount) && Objects.equals(this.tableCount, that.tableCount)
            && Objects.equals(this.dataSize, that.dataSize) && Objects.equals(this.databases, that.databases)
            && Objects.equals(this.folders, that.folders) && Objects.equals(this.cssIndices, that.cssIndices)
            && Objects.equals(this.namespaces, that.namespaces) && Objects.equals(this.disStreams, that.disStreams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasourceName,
            datasourceType,
            datasourceGuid,
            datasourceQualifiedName,
            obsFolderCount,
            obsFileCount,
            cssIndexCount,
            cssIndexFieldCount,
            namespaceCount,
            gesVertexCount,
            gesEdgeCount,
            databaseCount,
            streamCount,
            tableCount,
            dataSize,
            databases,
            folders,
            cssIndices,
            namespaces,
            disStreams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataSource {\n");
        sb.append("    datasourceName: ").append(toIndentedString(datasourceName)).append("\n");
        sb.append("    datasourceType: ").append(toIndentedString(datasourceType)).append("\n");
        sb.append("    datasourceGuid: ").append(toIndentedString(datasourceGuid)).append("\n");
        sb.append("    datasourceQualifiedName: ").append(toIndentedString(datasourceQualifiedName)).append("\n");
        sb.append("    obsFolderCount: ").append(toIndentedString(obsFolderCount)).append("\n");
        sb.append("    obsFileCount: ").append(toIndentedString(obsFileCount)).append("\n");
        sb.append("    cssIndexCount: ").append(toIndentedString(cssIndexCount)).append("\n");
        sb.append("    cssIndexFieldCount: ").append(toIndentedString(cssIndexFieldCount)).append("\n");
        sb.append("    namespaceCount: ").append(toIndentedString(namespaceCount)).append("\n");
        sb.append("    gesVertexCount: ").append(toIndentedString(gesVertexCount)).append("\n");
        sb.append("    gesEdgeCount: ").append(toIndentedString(gesEdgeCount)).append("\n");
        sb.append("    databaseCount: ").append(toIndentedString(databaseCount)).append("\n");
        sb.append("    streamCount: ").append(toIndentedString(streamCount)).append("\n");
        sb.append("    tableCount: ").append(toIndentedString(tableCount)).append("\n");
        sb.append("    dataSize: ").append(toIndentedString(dataSize)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    folders: ").append(toIndentedString(folders)).append("\n");
        sb.append("    cssIndices: ").append(toIndentedString(cssIndices)).append("\n");
        sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
        sb.append("    disStreams: ").append(toIndentedString(disStreams)).append("\n");
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
