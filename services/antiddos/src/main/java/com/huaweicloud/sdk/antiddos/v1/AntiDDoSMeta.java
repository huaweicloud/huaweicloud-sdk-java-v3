package com.huaweicloud.sdk.antiddos.v1;

import com.huaweicloud.sdk.antiddos.v1.model.CreateDefaultConfigRequest;
import com.huaweicloud.sdk.antiddos.v1.model.CreateDefaultConfigResponse;
import com.huaweicloud.sdk.antiddos.v1.model.DdosConfig;
import com.huaweicloud.sdk.antiddos.v1.model.DeleteDefaultConfigRequest;
import com.huaweicloud.sdk.antiddos.v1.model.DeleteDefaultConfigResponse;
import com.huaweicloud.sdk.antiddos.v1.model.EnableDefensePolicyRequest;
import com.huaweicloud.sdk.antiddos.v1.model.EnableDefensePolicyResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ListDDosStatusRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ListDDosStatusResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ListDailyLogRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ListDailyLogResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ListDailyReportRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ListDailyReportResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ListQuotaRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ListQuotaResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ListWeeklyReportsRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ListWeeklyReportsResponse;
import com.huaweicloud.sdk.antiddos.v1.model.LtsConfigRequestAndResponse;
import com.huaweicloud.sdk.antiddos.v1.model.OpenAntiDDosServiceRequestBody;
import com.huaweicloud.sdk.antiddos.v1.model.ShowDDosRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ShowDDosResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ShowDDosStatusRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ShowDDosStatusResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ShowDefaultConfigRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ShowDefaultConfigResponse;
import com.huaweicloud.sdk.antiddos.v1.model.ShowLogConfigRequest;
import com.huaweicloud.sdk.antiddos.v1.model.ShowLogConfigResponse;
import com.huaweicloud.sdk.antiddos.v1.model.UpdateAntiDDosServiceRequestBody;
import com.huaweicloud.sdk.antiddos.v1.model.UpdateDDosRequest;
import com.huaweicloud.sdk.antiddos.v1.model.UpdateDDosResponse;
import com.huaweicloud.sdk.antiddos.v1.model.UpdateLogConfigRequest;
import com.huaweicloud.sdk.antiddos.v1.model.UpdateLogConfigResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class AntiDDoSMeta {

    public static final HttpRequestDef<CreateDefaultConfigRequest, CreateDefaultConfigResponse> createDefaultConfig =
        genForCreateDefaultConfig();

    private static HttpRequestDef<CreateDefaultConfigRequest, CreateDefaultConfigResponse> genForCreateDefaultConfig() {
        // basic
        HttpRequestDef.Builder<CreateDefaultConfigRequest, CreateDefaultConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDefaultConfigRequest.class, CreateDefaultConfigResponse.class)
                .withName("CreateDefaultConfig")
                .withUri("/v1/{project_id}/antiddos/default-config")
                .withContentType("application/json");

        // requests
        builder.<DdosConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DdosConfig.class),
            f -> f.withMarshaller(CreateDefaultConfigRequest::getBody, CreateDefaultConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDefaultConfigRequest, DeleteDefaultConfigResponse> deleteDefaultConfig =
        genForDeleteDefaultConfig();

    private static HttpRequestDef<DeleteDefaultConfigRequest, DeleteDefaultConfigResponse> genForDeleteDefaultConfig() {
        // basic
        HttpRequestDef.Builder<DeleteDefaultConfigRequest, DeleteDefaultConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDefaultConfigRequest.class, DeleteDefaultConfigResponse.class)
            .withName("DeleteDefaultConfig")
            .withUri("/v1/{project_id}/antiddos/default-config")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDefaultConfigRequest, ShowDefaultConfigResponse> showDefaultConfig =
        genForShowDefaultConfig();

    private static HttpRequestDef<ShowDefaultConfigRequest, ShowDefaultConfigResponse> genForShowDefaultConfig() {
        // basic
        HttpRequestDef.Builder<ShowDefaultConfigRequest, ShowDefaultConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDefaultConfigRequest.class, ShowDefaultConfigResponse.class)
                .withName("ShowDefaultConfig")
                .withUri("/v1/{project_id}/antiddos/default-config")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableDefensePolicyRequest, EnableDefensePolicyResponse> enableDefensePolicy =
        genForEnableDefensePolicy();

    private static HttpRequestDef<EnableDefensePolicyRequest, EnableDefensePolicyResponse> genForEnableDefensePolicy() {
        // basic
        HttpRequestDef.Builder<EnableDefensePolicyRequest, EnableDefensePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableDefensePolicyRequest.class, EnableDefensePolicyResponse.class)
                .withName("EnableDefensePolicy")
                .withUri("/v1/{project_id}/antiddos/{floating_ip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("floating_ip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableDefensePolicyRequest::getFloatingIpId,
                EnableDefensePolicyRequest::setFloatingIpId));
        builder.<OpenAntiDDosServiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenAntiDDosServiceRequestBody.class),
            f -> f.withMarshaller(EnableDefensePolicyRequest::getBody, EnableDefensePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDDosStatusRequest, ListDDosStatusResponse> listDDosStatus =
        genForListDDosStatus();

    private static HttpRequestDef<ListDDosStatusRequest, ListDDosStatusResponse> genForListDDosStatus() {
        // basic
        HttpRequestDef.Builder<ListDDosStatusRequest, ListDDosStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDDosStatusRequest.class, ListDDosStatusResponse.class)
                .withName("ListDDosStatus")
                .withUri("/v1/{project_id}/antiddos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDDosStatusRequest::getStatus, ListDDosStatusRequest::setStatus));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDDosStatusRequest::getLimit, ListDDosStatusRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDDosStatusRequest::getOffset, ListDDosStatusRequest::setOffset));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDDosStatusRequest::getIp, ListDDosStatusRequest::setIp));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDailyLogRequest, ListDailyLogResponse> listDailyLog = genForListDailyLog();

    private static HttpRequestDef<ListDailyLogRequest, ListDailyLogResponse> genForListDailyLog() {
        // basic
        HttpRequestDef.Builder<ListDailyLogRequest, ListDailyLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDailyLogRequest.class, ListDailyLogResponse.class)
                .withName("ListDailyLog")
                .withUri("/v1/{project_id}/antiddos/{floating_ip_id}/logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("floating_ip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDailyLogRequest::getFloatingIpId, ListDailyLogRequest::setFloatingIpId));
        builder.<ListDailyLogRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDailyLogRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListDailyLogRequest::getSortDir, ListDailyLogRequest::setSortDir));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDailyLogRequest::getLimit, ListDailyLogRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDailyLogRequest::getOffset, ListDailyLogRequest::setOffset));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDailyLogRequest::getIp, ListDailyLogRequest::setIp));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDailyReportRequest, ListDailyReportResponse> listDailyReport =
        genForListDailyReport();

    private static HttpRequestDef<ListDailyReportRequest, ListDailyReportResponse> genForListDailyReport() {
        // basic
        HttpRequestDef.Builder<ListDailyReportRequest, ListDailyReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDailyReportRequest.class, ListDailyReportResponse.class)
                .withName("ListDailyReport")
                .withUri("/v1/{project_id}/antiddos/{floating_ip_id}/daily")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("floating_ip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDailyReportRequest::getFloatingIpId, ListDailyReportRequest::setFloatingIpId));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDailyReportRequest::getIp, ListDailyReportRequest::setIp));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotaRequest, ListQuotaResponse> listQuota = genForListQuota();

    private static HttpRequestDef<ListQuotaRequest, ListQuotaResponse> genForListQuota() {
        // basic
        HttpRequestDef.Builder<ListQuotaRequest, ListQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotaRequest.class, ListQuotaResponse.class)
                .withName("ListQuota")
                .withUri("/v1/{project_id}/antiddos/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWeeklyReportsRequest, ListWeeklyReportsResponse> listWeeklyReports =
        genForListWeeklyReports();

    private static HttpRequestDef<ListWeeklyReportsRequest, ListWeeklyReportsResponse> genForListWeeklyReports() {
        // basic
        HttpRequestDef.Builder<ListWeeklyReportsRequest, ListWeeklyReportsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWeeklyReportsRequest.class, ListWeeklyReportsResponse.class)
                .withName("ListWeeklyReports")
                .withUri("/v1/{project_id}/antiddos/weekly")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("period_start_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWeeklyReportsRequest::getPeriodStartDate,
                ListWeeklyReportsRequest::setPeriodStartDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDDosRequest, ShowDDosResponse> showDDos = genForShowDDos();

    private static HttpRequestDef<ShowDDosRequest, ShowDDosResponse> genForShowDDos() {
        // basic
        HttpRequestDef.Builder<ShowDDosRequest, ShowDDosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDDosRequest.class, ShowDDosResponse.class)
                .withName("ShowDDos")
                .withUri("/v1/{project_id}/antiddos/{floating_ip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("floating_ip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDDosRequest::getFloatingIpId, ShowDDosRequest::setFloatingIpId));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDDosRequest::getIp, ShowDDosRequest::setIp));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDDosStatusRequest, ShowDDosStatusResponse> showDDosStatus =
        genForShowDDosStatus();

    private static HttpRequestDef<ShowDDosStatusRequest, ShowDDosStatusResponse> genForShowDDosStatus() {
        // basic
        HttpRequestDef.Builder<ShowDDosStatusRequest, ShowDDosStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDDosStatusRequest.class, ShowDDosStatusResponse.class)
                .withName("ShowDDosStatus")
                .withUri("/v1/{project_id}/antiddos/{floating_ip_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("floating_ip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDDosStatusRequest::getFloatingIpId, ShowDDosStatusRequest::setFloatingIpId));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDDosStatusRequest::getIp, ShowDDosStatusRequest::setIp));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLogConfigRequest, ShowLogConfigResponse> showLogConfig =
        genForShowLogConfig();

    private static HttpRequestDef<ShowLogConfigRequest, ShowLogConfigResponse> genForShowLogConfig() {
        // basic
        HttpRequestDef.Builder<ShowLogConfigRequest, ShowLogConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLogConfigRequest.class, ShowLogConfigResponse.class)
                .withName("ShowLogConfig")
                .withUri("/v1/{project_id}/antiddos/lts-config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogConfigRequest::getEnterpriseProjectId,
                ShowLogConfigRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDDosRequest, UpdateDDosResponse> updateDDos = genForUpdateDDos();

    private static HttpRequestDef<UpdateDDosRequest, UpdateDDosResponse> genForUpdateDDos() {
        // basic
        HttpRequestDef.Builder<UpdateDDosRequest, UpdateDDosResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDDosRequest.class, UpdateDDosResponse.class)
                .withName("UpdateDDos")
                .withUri("/v1/{project_id}/antiddos/{floating_ip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("floating_ip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDDosRequest::getFloatingIpId, UpdateDDosRequest::setFloatingIpId));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDDosRequest::getIp, UpdateDDosRequest::setIp));
        builder.<UpdateAntiDDosServiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAntiDDosServiceRequestBody.class),
            f -> f.withMarshaller(UpdateDDosRequest::getBody, UpdateDDosRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLogConfigRequest, UpdateLogConfigResponse> updateLogConfig =
        genForUpdateLogConfig();

    private static HttpRequestDef<UpdateLogConfigRequest, UpdateLogConfigResponse> genForUpdateLogConfig() {
        // basic
        HttpRequestDef.Builder<UpdateLogConfigRequest, UpdateLogConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLogConfigRequest.class, UpdateLogConfigResponse.class)
                .withName("UpdateLogConfig")
                .withUri("/v1/{project_id}/antiddos/lts-config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLogConfigRequest::getEnterpriseProjectId,
                UpdateLogConfigRequest::setEnterpriseProjectId));
        builder.<LtsConfigRequestAndResponse>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LtsConfigRequestAndResponse.class),
            f -> f.withMarshaller(UpdateLogConfigRequest::getBody, UpdateLogConfigRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(UpdateLogConfigResponse::getBody, UpdateLogConfigResponse::setBody));

        return builder.build();
    }

}
