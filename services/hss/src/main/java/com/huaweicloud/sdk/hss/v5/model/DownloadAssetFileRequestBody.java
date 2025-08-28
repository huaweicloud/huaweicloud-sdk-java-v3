package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DownloadAssetFileRequestBody
 */
public class DownloadAssetFileRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_param")

    private String searchParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_headers")

    private List<List<String>> exportHeaders = null;

    public DownloadAssetFileRequestBody withSearchParam(String searchParam) {
        this.searchParam = searchParam;
        return this;
    }

    /**
     * **参数解释**: 查询条件，json格式字符串，如{\\\"port_string\\\": \\\"8080\\\"} **约束限制**: 如下接口的请求参数的json格式 - users         ：/v5/{project_id}/asset/users - auto_launch   ：/v5/{project_id}/asset/auto-launchs - database      ：/v5/{project_id}/asset/web-app-and-services - jar_package   ：/v5/{project_id}/asset/midwares/detail - port          ：/v5/{project_id}/asset/ports/detail - process       ：/v5/{project_id}/asset/processes/detail - web_cms       ：/v5/{project_id}/asset/web-app-and-services - web_framework ：/v5/{project_id}/asset/host/web-framework - web_service   ：/v5/{project_id}/asset/web-app-and-services - web_site      ：/v5/{project_id}/asset/host/web-site - app           ：/v5/{project_id}/asset/apps - kernel_module ：/v5/{project_id}/asset/host/kernel-module  **取值范围**: 字符长度0-128 **默认取值**: 不涉及 
     * @return searchParam
     */
    public String getSearchParam() {
        return searchParam;
    }

    public void setSearchParam(String searchParam) {
        this.searchParam = searchParam;
    }

    public DownloadAssetFileRequestBody withExportHeaders(List<List<String>> exportHeaders) {
        this.exportHeaders = exportHeaders;
        return this;
    }

    public DownloadAssetFileRequestBody addExportHeadersItem(List<String> exportHeadersItem) {
        if (this.exportHeaders == null) {
            this.exportHeaders = new ArrayList<>();
        }
        this.exportHeaders.add(exportHeadersItem);
        return this;
    }

    public DownloadAssetFileRequestBody withExportHeaders(Consumer<List<List<String>>> exportHeadersSetter) {
        if (this.exportHeaders == null) {
            this.exportHeaders = new ArrayList<>();
        }
        exportHeadersSetter.accept(this.exportHeaders);
        return this;
    }

    /**
     * **参数解释**: 导出数据表头信息详情 **约束限制**: 表头信息应为如下格式[[字段1,表头1显示名称],[字段2,表头2显示名称],[字段3,表头3显示名称]] **取值范围**: 可从如下取值中选取部分或全部组成表头信息 所有资产都有如下字段： - host_name：主机服务器名 - host_ip：主机ip 其他资产类别特有字段： - users   - user_name：用户名   - login_permission：是否有登陆权限   - root_permission：是否有root权限   - user_group_name：用户组   - user_home_dir：用户目录   - shell：用户启动shell   - recent_scan_time：最近扫描时间   - first_scan_time：首次扫描时间   - container_id：容器id   - container_name：容器名称 - auto_launch   - name：名称   - type：类型   - path：文件路径   - hash：文件hash   - run_user：运行用户   - recent_scan_time：最近扫描时间   - container_id：容器id   - container_name：容器名称 - database - web_cms - web_service   - name：软件名称   - version：软件版本   - install_path：安装路径   - config_path：配置文件路径   - uid：用户id   - mode：软件文件权限   - pid：软件进程id   - proc_path：软件进程路径   - record_time：扫描时间   - container_id：容器id   - container_name：容器名称 - jar_package   - name：名称   - file_name：文件名   - catalogue：类别   - file_type：文件类型   - version：版本   - path：文件路径   - hash：文件hash   - uid：用户id   - gid：用户组id   - mode：文件权限   - pid：进程id   - proc_path：进程路径   - is_embedded：是否为内层jar包   - package_path：外层jar包路径   - record_time：扫描时间   - container_id：容器id   - container_name：容器名称 - port   - port_status：端口是否需要处理   - port：端口号   - type：类型   - pid：进程ID   - path：程序文件路径   - laddr：监听的ip   - container_id：容器id   - container_name：容器名称 - process   - process_path：进程路径   - launch_params：启动参数   - launch_time：启动时间   - user_name：运行用户   - run_permission：运行权限   - process_pid：进程ID   - hash：文件hash   - container_id：容器id   - container_name：容器名称 - web_framework   - name：名称   - file_name：文件名   - catalogue：类别   - file_type：文件类型   - version：版本   - path：文件路径   - hash：文件hash   - uid：用户id   - gid：用户组id   - mode：文件权限   - pid：进程id   - proc_path：进程路径   - record_time：扫描时间   - container_id：容器id   - container_name：容器名称 - web_site   - domain：对外域名   - port：对外端口号   - url_path：url路径   - path：web目录   - mode：web目录文件权限   - uid：用户id   - record_time：扫描时间   - is_https：是否为https   - pid：进程id   - cert_issuer：SSL证书颁发者   - cert_user：SSL证书使用者   - cert_issue_time：SSL证书颁发时间   - cert_expired_time：SSL证书到期时间   - container_id：容器id   - container_name：容器名称 - app   - app_name：软件名称   - version：版本号   - update_time：更新时间   - recent_scan_time：最近扫描时间   - container_id：容器id   - container_name：容器名称 - kernel_module   - name：名称   - version：版本   - srcversion：源码版本   - desc：描述   - path：文件路径   - size：文件大小   - mode：文件权限   - uid：用户id   - ctime：文件创建时间   - mtime：最后修改时间   - hash：文件hash   - record_time：扫描时间  **默认取值**: 不涉及 
     * @return exportHeaders
     */
    public List<List<String>> getExportHeaders() {
        return exportHeaders;
    }

    public void setExportHeaders(List<List<String>> exportHeaders) {
        this.exportHeaders = exportHeaders;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadAssetFileRequestBody that = (DownloadAssetFileRequestBody) obj;
        return Objects.equals(this.searchParam, that.searchParam)
            && Objects.equals(this.exportHeaders, that.exportHeaders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchParam, exportHeaders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadAssetFileRequestBody {\n");
        sb.append("    searchParam: ").append(toIndentedString(searchParam)).append("\n");
        sb.append("    exportHeaders: ").append(toIndentedString(exportHeaders)).append("\n");
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
