package com.huaweicloud.sdk.apm.v1;

import com.huaweicloud.sdk.apm.v1.model.AccessPointModel;
import com.huaweicloud.sdk.apm.v1.model.AgentDeleteParam;
import com.huaweicloud.sdk.apm.v1.model.AgentSearchParam;
import com.huaweicloud.sdk.apm.v1.model.AgentStatusChangeParam;
import com.huaweicloud.sdk.apm.v1.model.AlarmDataListRequest;
import com.huaweicloud.sdk.apm.v1.model.AlarmNotifyListRequest;
import com.huaweicloud.sdk.apm.v1.model.AppSearchParam;
import com.huaweicloud.sdk.apm.v1.model.BusinessEnvRequest;
import com.huaweicloud.sdk.apm.v1.model.BusinessTopoRequest;
import com.huaweicloud.sdk.apm.v1.model.ChangeAgentStatusRequest;
import com.huaweicloud.sdk.apm.v1.model.ChangeAgentStatusResponse;
import com.huaweicloud.sdk.apm.v1.model.CreateAkSkRequest;
import com.huaweicloud.sdk.apm.v1.model.CreateAkSkResponse;
import com.huaweicloud.sdk.apm.v1.model.CreateAkskModel;
import com.huaweicloud.sdk.apm.v1.model.CreateBusinessModel;
import com.huaweicloud.sdk.apm.v1.model.CreateBusinessRequest;
import com.huaweicloud.sdk.apm.v1.model.CreateBusinessResponse;
import com.huaweicloud.sdk.apm.v1.model.DeleteAgentRequest;
import com.huaweicloud.sdk.apm.v1.model.DeleteAgentResponse;
import com.huaweicloud.sdk.apm.v1.model.DeleteAkSkRequest;
import com.huaweicloud.sdk.apm.v1.model.DeleteAkSkResponse;
import com.huaweicloud.sdk.apm.v1.model.DeleteAppRequest;
import com.huaweicloud.sdk.apm.v1.model.DeleteAppResponse;
import com.huaweicloud.sdk.apm.v1.model.EnvTopoRequest;
import com.huaweicloud.sdk.apm.v1.model.FlameLineTreeInfo;
import com.huaweicloud.sdk.apm.v1.model.GetClobDetailParam;
import com.huaweicloud.sdk.apm.v1.model.GetEnvMonitorItemListParam;
import com.huaweicloud.sdk.apm.v1.model.InstanceSearchParam;
import com.huaweicloud.sdk.apm.v1.model.ListAkSkRequest;
import com.huaweicloud.sdk.apm.v1.model.ListAkSkResponse;
import com.huaweicloud.sdk.apm.v1.model.ListAlarmDataRequest;
import com.huaweicloud.sdk.apm.v1.model.ListAlarmDataResponse;
import com.huaweicloud.sdk.apm.v1.model.ListAlarmNotifyRequest;
import com.huaweicloud.sdk.apm.v1.model.ListAlarmNotifyResponse;
import com.huaweicloud.sdk.apm.v1.model.ListAppEnvsRequest;
import com.huaweicloud.sdk.apm.v1.model.ListAppEnvsResponse;
import com.huaweicloud.sdk.apm.v1.model.ListAppsRequest;
import com.huaweicloud.sdk.apm.v1.model.ListAppsResponse;
import com.huaweicloud.sdk.apm.v1.model.ListBusinessEnvRequest;
import com.huaweicloud.sdk.apm.v1.model.ListBusinessEnvResponse;
import com.huaweicloud.sdk.apm.v1.model.ListBusinessRequest;
import com.huaweicloud.sdk.apm.v1.model.ListBusinessResponse;
import com.huaweicloud.sdk.apm.v1.model.ListEnvInstancesRequest;
import com.huaweicloud.sdk.apm.v1.model.ListEnvInstancesResponse;
import com.huaweicloud.sdk.apm.v1.model.ListEnvMonitorItemRequest;
import com.huaweicloud.sdk.apm.v1.model.ListEnvMonitorItemResponse;
import com.huaweicloud.sdk.apm.v1.model.ListEnvTagsRequest;
import com.huaweicloud.sdk.apm.v1.model.ListEnvTagsResponse;
import com.huaweicloud.sdk.apm.v1.model.ListOpenRegionRequest;
import com.huaweicloud.sdk.apm.v1.model.ListOpenRegionResponse;
import com.huaweicloud.sdk.apm.v1.model.ListSupportedRegionRequest;
import com.huaweicloud.sdk.apm.v1.model.ListSupportedRegionResponse;
import com.huaweicloud.sdk.apm.v1.model.RawTableParam;
import com.huaweicloud.sdk.apm.v1.model.SaveMonitorItemConfigRequest;
import com.huaweicloud.sdk.apm.v1.model.SaveMonitorItemConfigResponse;
import com.huaweicloud.sdk.apm.v1.model.SaveMonitorItemParam;
import com.huaweicloud.sdk.apm.v1.model.SearchAgentRequest;
import com.huaweicloud.sdk.apm.v1.model.SearchAgentResponse;
import com.huaweicloud.sdk.apm.v1.model.SearchApplicationRequest;
import com.huaweicloud.sdk.apm.v1.model.SearchApplicationResponse;
import com.huaweicloud.sdk.apm.v1.model.SearchBusinessTopologyRequest;
import com.huaweicloud.sdk.apm.v1.model.SearchBusinessTopologyResponse;
import com.huaweicloud.sdk.apm.v1.model.SearchEnvTopologyRequest;
import com.huaweicloud.sdk.apm.v1.model.SearchEnvTopologyResponse;
import com.huaweicloud.sdk.apm.v1.model.SearchTransactionConfigRequest;
import com.huaweicloud.sdk.apm.v1.model.SearchTransactionConfigResponse;
import com.huaweicloud.sdk.apm.v1.model.SearchTransactionRequest;
import com.huaweicloud.sdk.apm.v1.model.SearchTransactionResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowAccessPointRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowAccessPointResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowAkSksRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowAkSksResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowBusinessDetailRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowBusinessDetailResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowClobDetailRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowClobDetailResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowEnvMonitorItemsRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowEnvMonitorItemsResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowEventDetailRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowEventDetailResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowFlameLineTreeRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowFlameLineTreeResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowMasterAddressRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowMasterAddressResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowMonitorItemDetailRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowMonitorItemDetailResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowMonitorItemViewConfigRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowMonitorItemViewConfigResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowRawTableRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowRawTableResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowSpanSearchRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowSpanSearchResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowSubBusinessDetailRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowSubBusinessDetailResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowSumTableRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowSumTableResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowTokenRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowTokenResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowTopologyRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowTopologyResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowTopologyTreeRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowTopologyTreeResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowTraceEventsRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowTraceEventsResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowTransactionDetailRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowTransactionDetailResponse;
import com.huaweicloud.sdk.apm.v1.model.ShowTrendRequest;
import com.huaweicloud.sdk.apm.v1.model.ShowTrendResponse;
import com.huaweicloud.sdk.apm.v1.model.SumTableParam;
import com.huaweicloud.sdk.apm.v1.model.TagParam;
import com.huaweicloud.sdk.apm.v1.model.TraceSearchParam;
import com.huaweicloud.sdk.apm.v1.model.TransactionConfigSearchRequest;
import com.huaweicloud.sdk.apm.v1.model.TrendParam;
import com.huaweicloud.sdk.apm.v1.model.TxDetailRequest;
import com.huaweicloud.sdk.apm.v1.model.TxSearchRequest;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class ApmMeta {

    public static final HttpRequestDef<CreateAkSkRequest, CreateAkSkResponse> createAkSk = genForCreateAkSk();

    private static HttpRequestDef<CreateAkSkRequest, CreateAkSkResponse> genForCreateAkSk() {
        // basic
        HttpRequestDef.Builder<CreateAkSkRequest, CreateAkSkResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAkSkRequest.class, CreateAkSkResponse.class)
                .withName("CreateAkSk")
                .withUri("/v1/apm2/access-keys")
                .withContentType("application/json");

        // requests
        builder.<CreateAkskModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateAkskModel.class),
            f -> f.withMarshaller(CreateAkSkRequest::getBody, CreateAkSkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAkSkRequest, DeleteAkSkResponse> deleteAkSk = genForDeleteAkSk();

    private static HttpRequestDef<DeleteAkSkRequest, DeleteAkSkResponse> genForDeleteAkSk() {
        // basic
        HttpRequestDef.Builder<DeleteAkSkRequest, DeleteAkSkResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAkSkRequest.class, DeleteAkSkResponse.class)
                .withName("DeleteAkSk")
                .withUri("/v1/apm2/access-keys/{ak}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ak",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAkSkRequest::getAk, DeleteAkSkRequest::setAk));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAkSksRequest, ShowAkSksResponse> showAkSks = genForShowAkSks();

    private static HttpRequestDef<ShowAkSksRequest, ShowAkSksResponse> genForShowAkSks() {
        // basic
        HttpRequestDef.Builder<ShowAkSksRequest, ShowAkSksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAkSksRequest.class, ShowAkSksResponse.class)
                .withName("ShowAkSks")
                .withUri("/v1/apm2/access-keys")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmDataRequest, ListAlarmDataResponse> listAlarmData =
        genForListAlarmData();

    private static HttpRequestDef<ListAlarmDataRequest, ListAlarmDataResponse> genForListAlarmData() {
        // basic
        HttpRequestDef.Builder<ListAlarmDataRequest, ListAlarmDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAlarmDataRequest.class, ListAlarmDataResponse.class)
                .withName("ListAlarmData")
                .withUri("/v1/apm2/openapi/alarm/data/get-alarm-data-list")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAlarmDataRequest::getXBusinessId, ListAlarmDataRequest::setXBusinessId));
        builder.<AlarmDataListRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlarmDataListRequest.class),
            f -> f.withMarshaller(ListAlarmDataRequest::getBody, ListAlarmDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmNotifyRequest, ListAlarmNotifyResponse> listAlarmNotify =
        genForListAlarmNotify();

    private static HttpRequestDef<ListAlarmNotifyRequest, ListAlarmNotifyResponse> genForListAlarmNotify() {
        // basic
        HttpRequestDef.Builder<ListAlarmNotifyRequest, ListAlarmNotifyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAlarmNotifyRequest.class, ListAlarmNotifyResponse.class)
                .withName("ListAlarmNotify")
                .withUri("/v1/apm2/openapi/alarm/data/get-alarm-notify-list")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAlarmNotifyRequest::getXBusinessId, ListAlarmNotifyRequest::setXBusinessId));
        builder.<AlarmNotifyListRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlarmNotifyListRequest.class),
            f -> f.withMarshaller(ListAlarmNotifyRequest::getBody, ListAlarmNotifyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeAgentStatusRequest, ChangeAgentStatusResponse> changeAgentStatus =
        genForChangeAgentStatus();

    private static HttpRequestDef<ChangeAgentStatusRequest, ChangeAgentStatusResponse> genForChangeAgentStatus() {
        // basic
        HttpRequestDef.Builder<ChangeAgentStatusRequest, ChangeAgentStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeAgentStatusRequest.class, ChangeAgentStatusResponse.class)
                .withName("ChangeAgentStatus")
                .withUri("/v1/apm2/openapi/apm-service/agent-mgr/change-status")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ChangeAgentStatusRequest::getXBusinessId, ChangeAgentStatusRequest::setXBusinessId));
        builder.<AgentStatusChangeParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AgentStatusChangeParam.class),
            f -> f.withMarshaller(ChangeAgentStatusRequest::getBody, ChangeAgentStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAgentRequest, DeleteAgentResponse> deleteAgent = genForDeleteAgent();

    private static HttpRequestDef<DeleteAgentRequest, DeleteAgentResponse> genForDeleteAgent() {
        // basic
        HttpRequestDef.Builder<DeleteAgentRequest, DeleteAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteAgentRequest.class, DeleteAgentResponse.class)
                .withName("DeleteAgent")
                .withUri("/v1/apm2/openapi/apm-service/agent-mgr/delete-agent")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteAgentRequest::getXBusinessId, DeleteAgentRequest::setXBusinessId));
        builder.<AgentDeleteParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AgentDeleteParam.class),
            f -> f.withMarshaller(DeleteAgentRequest::getBody, DeleteAgentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAkSkRequest, ListAkSkResponse> listAkSk = genForListAkSk();

    private static HttpRequestDef<ListAkSkRequest, ListAkSkResponse> genForListAkSk() {
        // basic
        HttpRequestDef.Builder<ListAkSkRequest, ListAkSkResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAkSkRequest.class, ListAkSkResponse.class)
                .withName("ListAkSk")
                .withUri("/v1/apm2/openapi/systemmng/get-ak-sk-list")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBusinessRequest, ListBusinessResponse> listBusiness = genForListBusiness();

    private static HttpRequestDef<ListBusinessRequest, ListBusinessResponse> genForListBusiness() {
        // basic
        HttpRequestDef.Builder<ListBusinessRequest, ListBusinessResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBusinessRequest.class, ListBusinessResponse.class)
                .withName("ListBusiness")
                .withUri("/v1/apm2/openapi/cmdb/business/get-business-list")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnvMonitorItemRequest, ListEnvMonitorItemResponse> listEnvMonitorItem =
        genForListEnvMonitorItem();

    private static HttpRequestDef<ListEnvMonitorItemRequest, ListEnvMonitorItemResponse> genForListEnvMonitorItem() {
        // basic
        HttpRequestDef.Builder<ListEnvMonitorItemRequest, ListEnvMonitorItemResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListEnvMonitorItemRequest.class, ListEnvMonitorItemResponse.class)
                .withName("ListEnvMonitorItem")
                .withUri("/v1/apm2/openapi/apm-service/monitor-item-mgr/get-env-monitor-item-list")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEnvMonitorItemRequest::getXBusinessId,
                ListEnvMonitorItemRequest::setXBusinessId));
        builder.<GetEnvMonitorItemListParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(GetEnvMonitorItemListParam.class),
            f -> f.withMarshaller(ListEnvMonitorItemRequest::getBody, ListEnvMonitorItemRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveMonitorItemConfigRequest, SaveMonitorItemConfigResponse> saveMonitorItemConfig =
        genForSaveMonitorItemConfig();

    private static HttpRequestDef<SaveMonitorItemConfigRequest, SaveMonitorItemConfigResponse> genForSaveMonitorItemConfig() {
        // basic
        HttpRequestDef.Builder<SaveMonitorItemConfigRequest, SaveMonitorItemConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SaveMonitorItemConfigRequest.class, SaveMonitorItemConfigResponse.class)
            .withName("SaveMonitorItemConfig")
            .withUri("/v1/apm2/openapi/apm-service/monitor-item-mgr/save-monitor-item-config")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SaveMonitorItemConfigRequest::getXBusinessId,
                SaveMonitorItemConfigRequest::setXBusinessId));
        builder.<SaveMonitorItemParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SaveMonitorItemParam.class),
            f -> f.withMarshaller(SaveMonitorItemConfigRequest::getBody, SaveMonitorItemConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchAgentRequest, SearchAgentResponse> searchAgent = genForSearchAgent();

    private static HttpRequestDef<SearchAgentRequest, SearchAgentResponse> genForSearchAgent() {
        // basic
        HttpRequestDef.Builder<SearchAgentRequest, SearchAgentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchAgentRequest.class, SearchAgentResponse.class)
                .withName("SearchAgent")
                .withUri("/v1/apm2/openapi/apm-service/agent-mgr/search")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchAgentRequest::getXBusinessId, SearchAgentRequest::setXBusinessId));
        builder.<AgentSearchParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AgentSearchParam.class),
            f -> f.withMarshaller(SearchAgentRequest::getBody, SearchAgentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchApplicationRequest, SearchApplicationResponse> searchApplication =
        genForSearchApplication();

    private static HttpRequestDef<SearchApplicationRequest, SearchApplicationResponse> genForSearchApplication() {
        // basic
        HttpRequestDef.Builder<SearchApplicationRequest, SearchApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchApplicationRequest.class, SearchApplicationResponse.class)
                .withName("SearchApplication")
                .withUri("/v1/apm2/openapi/apm-service/app-mgr/search")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchApplicationRequest::getXBusinessId, SearchApplicationRequest::setXBusinessId));
        builder.<AppSearchParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppSearchParam.class),
            f -> f.withMarshaller(SearchApplicationRequest::getBody, SearchApplicationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMasterAddressRequest, ShowMasterAddressResponse> showMasterAddress =
        genForShowMasterAddress();

    private static HttpRequestDef<ShowMasterAddressRequest, ShowMasterAddressResponse> genForShowMasterAddress() {
        // basic
        HttpRequestDef.Builder<ShowMasterAddressRequest, ShowMasterAddressResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMasterAddressRequest.class, ShowMasterAddressResponse.class)
                .withName("ShowMasterAddress")
                .withUri("/v1/apm2/openapi/systemmng/get-master-address")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMasterAddressRequest::getRegionName, ShowMasterAddressRequest::setRegionName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppRequest, DeleteAppResponse> deleteApp = genForDeleteApp();

    private static HttpRequestDef<DeleteAppRequest, DeleteAppResponse> genForDeleteApp() {
        // basic
        HttpRequestDef.Builder<DeleteAppRequest, DeleteAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppRequest.class, DeleteAppResponse.class)
                .withName("DeleteApp")
                .withUri("/v1/apm2/openapi/cmdb/apps/delete-app/{application_id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteAppRequest::getApplicationId, DeleteAppRequest::setApplicationId));
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteAppRequest::getXBusinessId, DeleteAppRequest::setXBusinessId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppEnvsRequest, ListAppEnvsResponse> listAppEnvs = genForListAppEnvs();

    private static HttpRequestDef<ListAppEnvsRequest, ListAppEnvsResponse> genForListAppEnvs() {
        // basic
        HttpRequestDef.Builder<ListAppEnvsRequest, ListAppEnvsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppEnvsRequest.class, ListAppEnvsResponse.class)
                .withName("ListAppEnvs")
                .withUri("/v1/apm2/openapi/cmdb/envs/get-app-envs")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppEnvsRequest::getAppId, ListAppEnvsRequest::setAppId));
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppEnvsRequest::getXBusinessId, ListAppEnvsRequest::setXBusinessId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppsRequest, ListAppsResponse> listApps = genForListApps();

    private static HttpRequestDef<ListAppsRequest, ListAppsResponse> genForListApps() {
        // basic
        HttpRequestDef.Builder<ListAppsRequest, ListAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppsRequest.class, ListAppsResponse.class)
                .withName("ListApps")
                .withUri("/v1/apm2/openapi/cmdb/apps/get-apps")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("business_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppsRequest::getBusinessId, ListAppsRequest::setBusinessId));
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppsRequest::getXBusinessId, ListAppsRequest::setXBusinessId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnvTagsRequest, ListEnvTagsResponse> listEnvTags = genForListEnvTags();

    private static HttpRequestDef<ListEnvTagsRequest, ListEnvTagsResponse> genForListEnvTags() {
        // basic
        HttpRequestDef.Builder<ListEnvTagsRequest, ListEnvTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListEnvTagsRequest.class, ListEnvTagsResponse.class)
                .withName("ListEnvTags")
                .withUri("/v1/apm2/openapi/cmdb/tag/get-env-tag-list")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEnvTagsRequest::getXBusinessId, ListEnvTagsRequest::setXBusinessId));
        builder.<TagParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagParam.class),
            f -> f.withMarshaller(ListEnvTagsRequest::getBody, ListEnvTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBusinessDetailRequest, ShowBusinessDetailResponse> showBusinessDetail =
        genForShowBusinessDetail();

    private static HttpRequestDef<ShowBusinessDetailRequest, ShowBusinessDetailResponse> genForShowBusinessDetail() {
        // basic
        HttpRequestDef.Builder<ShowBusinessDetailRequest, ShowBusinessDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBusinessDetailRequest.class, ShowBusinessDetailResponse.class)
                .withName("ShowBusinessDetail")
                .withUri("/v1/apm2/openapi/cmdb/business/get-business-detail/{business_id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("business_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowBusinessDetailRequest::getBusinessId, ShowBusinessDetailRequest::setBusinessId));
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowBusinessDetailRequest::getXBusinessId,
                ShowBusinessDetailRequest::setXBusinessId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubBusinessDetailRequest, ShowSubBusinessDetailResponse> showSubBusinessDetail =
        genForShowSubBusinessDetail();

    private static HttpRequestDef<ShowSubBusinessDetailRequest, ShowSubBusinessDetailResponse> genForShowSubBusinessDetail() {
        // basic
        HttpRequestDef.Builder<ShowSubBusinessDetailRequest, ShowSubBusinessDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSubBusinessDetailRequest.class, ShowSubBusinessDetailResponse.class)
            .withName("ShowSubBusinessDetail")
            .withUri("/v1/apm2/openapi/cmdb/sub-business/get-sub-business-detail/{sub_business_id}")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("sub_business_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowSubBusinessDetailRequest::getSubBusinessId,
                ShowSubBusinessDetailRequest::setSubBusinessId));
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowSubBusinessDetailRequest::getXBusinessId,
                ShowSubBusinessDetailRequest::setXBusinessId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTopologyTreeRequest, ShowTopologyTreeResponse> showTopologyTree =
        genForShowTopologyTree();

    private static HttpRequestDef<ShowTopologyTreeRequest, ShowTopologyTreeResponse> genForShowTopologyTree() {
        // basic
        HttpRequestDef.Builder<ShowTopologyTreeRequest, ShowTopologyTreeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTopologyTreeRequest.class, ShowTopologyTreeResponse.class)
                .withName("ShowTopologyTree")
                .withUri("/v1/apm2/openapi/cmdb/topology-trees/get-topology-trees")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopologyTreeRequest::getRegionId, ShowTopologyTreeRequest::setRegionId));
        builder.<Long>withRequestField("business_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTopologyTreeRequest::getBusinessId, ShowTopologyTreeRequest::setBusinessId));
        builder.<Long>withRequestField("env_tag_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTopologyTreeRequest::getEnvTagId, ShowTopologyTreeRequest::setEnvTagId));
        builder.<String>withRequestField("env_keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopologyTreeRequest::getEnvKeyword, ShowTopologyTreeRequest::setEnvKeyword));
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTopologyTreeRequest::getXBusinessId, ShowTopologyTreeRequest::setXBusinessId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlameLineTreeRequest, ShowFlameLineTreeResponse> showFlameLineTree =
        genForShowFlameLineTree();

    private static HttpRequestDef<ShowFlameLineTreeRequest, ShowFlameLineTreeResponse> genForShowFlameLineTree() {
        // basic
        HttpRequestDef.Builder<ShowFlameLineTreeRequest, ShowFlameLineTreeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowFlameLineTreeRequest.class, ShowFlameLineTreeResponse.class)
                .withName("ShowFlameLineTree")
                .withUri("/v1/apm2/openapi/view/profiling/flame-line-tree")
                .withContentType("application/json");

        // requests
        builder.<FlameLineTreeInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FlameLineTreeInfo.class),
            f -> f.withMarshaller(ShowFlameLineTreeRequest::getBody, ShowFlameLineTreeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOpenRegionRequest, ListOpenRegionResponse> listOpenRegion =
        genForListOpenRegion();

    private static HttpRequestDef<ListOpenRegionRequest, ListOpenRegionResponse> genForListOpenRegion() {
        // basic
        HttpRequestDef.Builder<ListOpenRegionRequest, ListOpenRegionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOpenRegionRequest.class, ListOpenRegionResponse.class)
                .withName("ListOpenRegion")
                .withUri("/v1/apm2/openapi/region/get-opened-region")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSupportedRegionRequest, ListSupportedRegionResponse> listSupportedRegion =
        genForListSupportedRegion();

    private static HttpRequestDef<ListSupportedRegionRequest, ListSupportedRegionResponse> genForListSupportedRegion() {
        // basic
        HttpRequestDef.Builder<ListSupportedRegionRequest, ListSupportedRegionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSupportedRegionRequest.class, ListSupportedRegionResponse.class)
                .withName("ListSupportedRegion")
                .withUri("/v1/apm2/openapi/region/get-all-supported-region")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchBusinessTopologyRequest, SearchBusinessTopologyResponse> searchBusinessTopology =
        genForSearchBusinessTopology();

    private static HttpRequestDef<SearchBusinessTopologyRequest, SearchBusinessTopologyResponse> genForSearchBusinessTopology() {
        // basic
        HttpRequestDef.Builder<SearchBusinessTopologyRequest, SearchBusinessTopologyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SearchBusinessTopologyRequest.class, SearchBusinessTopologyResponse.class)
            .withName("SearchBusinessTopology")
            .withUri("/v1/apm2/openapi/topology/business-search")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchBusinessTopologyRequest::getXBusinessId,
                SearchBusinessTopologyRequest::setXBusinessId));
        builder.<BusinessTopoRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BusinessTopoRequest.class),
            f -> f.withMarshaller(SearchBusinessTopologyRequest::getBody, SearchBusinessTopologyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchEnvTopologyRequest, SearchEnvTopologyResponse> searchEnvTopology =
        genForSearchEnvTopology();

    private static HttpRequestDef<SearchEnvTopologyRequest, SearchEnvTopologyResponse> genForSearchEnvTopology() {
        // basic
        HttpRequestDef.Builder<SearchEnvTopologyRequest, SearchEnvTopologyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchEnvTopologyRequest.class, SearchEnvTopologyResponse.class)
                .withName("SearchEnvTopology")
                .withUri("/v1/apm2/openapi/topology/env-search")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchEnvTopologyRequest::getXBusinessId, SearchEnvTopologyRequest::setXBusinessId));
        builder.<EnvTopoRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnvTopoRequest.class),
            f -> f.withMarshaller(SearchEnvTopologyRequest::getBody, SearchEnvTopologyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBusinessRequest, CreateBusinessResponse> createBusiness =
        genForCreateBusiness();

    private static HttpRequestDef<CreateBusinessRequest, CreateBusinessResponse> genForCreateBusiness() {
        // basic
        HttpRequestDef.Builder<CreateBusinessRequest, CreateBusinessResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBusinessRequest.class, CreateBusinessResponse.class)
                .withName("CreateBusiness")
                .withUri("/v1/apm2/openapi/tracing/business/create")
                .withContentType("application/json");

        // requests
        builder.<CreateBusinessModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBusinessModel.class),
            f -> f.withMarshaller(CreateBusinessRequest::getBody, CreateBusinessRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAccessPointRequest, ShowAccessPointResponse> showAccessPoint =
        genForShowAccessPoint();

    private static HttpRequestDef<ShowAccessPointRequest, ShowAccessPointResponse> genForShowAccessPoint() {
        // basic
        HttpRequestDef.Builder<ShowAccessPointRequest, ShowAccessPointResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowAccessPointRequest.class, ShowAccessPointResponse.class)
                .withName("ShowAccessPoint")
                .withUri("/v1/apm2/openapi/tracing/access/get-access-point/{business_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("business_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAccessPointRequest::getBusinessId, ShowAccessPointRequest::setBusinessId));
        builder.<Integer>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAccessPointRequest::getXBusinessId, ShowAccessPointRequest::setXBusinessId));
        builder.<AccessPointModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AccessPointModel.class),
            f -> f.withMarshaller(ShowAccessPointRequest::getBody, ShowAccessPointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTokenRequest, ShowTokenResponse> showToken = genForShowToken();

    private static HttpRequestDef<ShowTokenRequest, ShowTokenResponse> genForShowToken() {
        // basic
        HttpRequestDef.Builder<ShowTokenRequest, ShowTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTokenRequest.class, ShowTokenResponse.class)
                .withName("ShowToken")
                .withUri("/v1/apm2/openapi/tracing/business/token/{business_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("business_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTokenRequest::getBusinessId, ShowTokenRequest::setBusinessId));
        builder.<Integer>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTokenRequest::getXBusinessId, ShowTokenRequest::setXBusinessId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBusinessEnvRequest, ListBusinessEnvResponse> listBusinessEnv =
        genForListBusinessEnv();

    private static HttpRequestDef<ListBusinessEnvRequest, ListBusinessEnvResponse> genForListBusinessEnv() {
        // basic
        HttpRequestDef.Builder<ListBusinessEnvRequest, ListBusinessEnvResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListBusinessEnvRequest.class, ListBusinessEnvResponse.class)
                .withName("ListBusinessEnv")
                .withUri("/v1/apm2/openapi/transaction/business-env")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBusinessEnvRequest::getXBusinessId, ListBusinessEnvRequest::setXBusinessId));
        builder.<BusinessEnvRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BusinessEnvRequest.class),
            f -> f.withMarshaller(ListBusinessEnvRequest::getBody, ListBusinessEnvRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchTransactionRequest, SearchTransactionResponse> searchTransaction =
        genForSearchTransaction();

    private static HttpRequestDef<SearchTransactionRequest, SearchTransactionResponse> genForSearchTransaction() {
        // basic
        HttpRequestDef.Builder<SearchTransactionRequest, SearchTransactionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchTransactionRequest.class, SearchTransactionResponse.class)
                .withName("SearchTransaction")
                .withUri("/v1/apm2/openapi/transaction/search")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchTransactionRequest::getXBusinessId, SearchTransactionRequest::setXBusinessId));
        builder.<TxSearchRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TxSearchRequest.class),
            f -> f.withMarshaller(SearchTransactionRequest::getBody, SearchTransactionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchTransactionConfigRequest, SearchTransactionConfigResponse> searchTransactionConfig =
        genForSearchTransactionConfig();

    private static HttpRequestDef<SearchTransactionConfigRequest, SearchTransactionConfigResponse> genForSearchTransactionConfig() {
        // basic
        HttpRequestDef.Builder<SearchTransactionConfigRequest, SearchTransactionConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SearchTransactionConfigRequest.class, SearchTransactionConfigResponse.class)
            .withName("SearchTransactionConfig")
            .withUri("/v1/apm2/openapi/transaction/transaction-config-search")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchTransactionConfigRequest::getXBusinessId,
                SearchTransactionConfigRequest::setXBusinessId));
        builder.<TransactionConfigSearchRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TransactionConfigSearchRequest.class),
            f -> f.withMarshaller(SearchTransactionConfigRequest::getBody, SearchTransactionConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTransactionDetailRequest, ShowTransactionDetailResponse> showTransactionDetail =
        genForShowTransactionDetail();

    private static HttpRequestDef<ShowTransactionDetailRequest, ShowTransactionDetailResponse> genForShowTransactionDetail() {
        // basic
        HttpRequestDef.Builder<ShowTransactionDetailRequest, ShowTransactionDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowTransactionDetailRequest.class, ShowTransactionDetailResponse.class)
            .withName("ShowTransactionDetail")
            .withUri("/v1/apm2/openapi/transaction/detail")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTransactionDetailRequest::getXBusinessId,
                ShowTransactionDetailRequest::setXBusinessId));
        builder.<TxDetailRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TxDetailRequest.class),
            f -> f.withMarshaller(ShowTransactionDetailRequest::getBody, ShowTransactionDetailRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnvInstancesRequest, ListEnvInstancesResponse> listEnvInstances =
        genForListEnvInstances();

    private static HttpRequestDef<ListEnvInstancesRequest, ListEnvInstancesResponse> genForListEnvInstances() {
        // basic
        HttpRequestDef.Builder<ListEnvInstancesRequest, ListEnvInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListEnvInstancesRequest.class, ListEnvInstancesResponse.class)
                .withName("ListEnvInstances")
                .withUri("/v1/apm2/openapi/view/mainview/get-env-instance-list")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEnvInstancesRequest::getXBusinessId, ListEnvInstancesRequest::setXBusinessId));
        builder.<InstanceSearchParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceSearchParam.class),
            f -> f.withMarshaller(ListEnvInstancesRequest::getBody, ListEnvInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClobDetailRequest, ShowClobDetailResponse> showClobDetail =
        genForShowClobDetail();

    private static HttpRequestDef<ShowClobDetailRequest, ShowClobDetailResponse> genForShowClobDetail() {
        // basic
        HttpRequestDef.Builder<ShowClobDetailRequest, ShowClobDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowClobDetailRequest.class, ShowClobDetailResponse.class)
                .withName("ShowClobDetail")
                .withUri("/v1/apm2/openapi/view/metric/get-clob-detail")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowClobDetailRequest::getXBusinessId, ShowClobDetailRequest::setXBusinessId));
        builder.<GetClobDetailParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetClobDetailParam.class),
            f -> f.withMarshaller(ShowClobDetailRequest::getBody, ShowClobDetailRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnvMonitorItemsRequest, ShowEnvMonitorItemsResponse> showEnvMonitorItems =
        genForShowEnvMonitorItems();

    private static HttpRequestDef<ShowEnvMonitorItemsRequest, ShowEnvMonitorItemsResponse> genForShowEnvMonitorItems() {
        // basic
        HttpRequestDef.Builder<ShowEnvMonitorItemsRequest, ShowEnvMonitorItemsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEnvMonitorItemsRequest.class, ShowEnvMonitorItemsResponse.class)
                .withName("ShowEnvMonitorItems")
                .withUri("/v1/apm2/openapi/view/mainview/get-env-monitor-item-list")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowEnvMonitorItemsRequest::getEnvId, ShowEnvMonitorItemsRequest::setEnvId));
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowEnvMonitorItemsRequest::getXBusinessId,
                ShowEnvMonitorItemsRequest::setXBusinessId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEventDetailRequest, ShowEventDetailResponse> showEventDetail =
        genForShowEventDetail();

    private static HttpRequestDef<ShowEventDetailRequest, ShowEventDetailResponse> genForShowEventDetail() {
        // basic
        HttpRequestDef.Builder<ShowEventDetailRequest, ShowEventDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEventDetailRequest.class, ShowEventDetailResponse.class)
                .withName("ShowEventDetail")
                .withUri("/v1/apm2/openapi/view/trace/get-event-detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("trace_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventDetailRequest::getTraceId, ShowEventDetailRequest::setTraceId));
        builder.<String>withRequestField("span_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventDetailRequest::getSpanId, ShowEventDetailRequest::setSpanId));
        builder.<String>withRequestField("event_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventDetailRequest::getEventId, ShowEventDetailRequest::setEventId));
        builder.<Long>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowEventDetailRequest::getEnvId, ShowEventDetailRequest::setEnvId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMonitorItemDetailRequest, ShowMonitorItemDetailResponse> showMonitorItemDetail =
        genForShowMonitorItemDetail();

    private static HttpRequestDef<ShowMonitorItemDetailRequest, ShowMonitorItemDetailResponse> genForShowMonitorItemDetail() {
        // basic
        HttpRequestDef.Builder<ShowMonitorItemDetailRequest, ShowMonitorItemDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowMonitorItemDetailRequest.class, ShowMonitorItemDetailResponse.class)
            .withName("ShowMonitorItemDetail")
            .withUri("/v1/apm2/openapi/apm-service/monitor-item-mgr/get-monitor-item-detail")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("monitor_item_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowMonitorItemDetailRequest::getMonitorItemId,
                ShowMonitorItemDetailRequest::setMonitorItemId));
        builder.<Long>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowMonitorItemDetailRequest::getEnvId, ShowMonitorItemDetailRequest::setEnvId));
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowMonitorItemDetailRequest::getXBusinessId,
                ShowMonitorItemDetailRequest::setXBusinessId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMonitorItemViewConfigRequest, ShowMonitorItemViewConfigResponse> showMonitorItemViewConfig =
        genForShowMonitorItemViewConfig();

    private static HttpRequestDef<ShowMonitorItemViewConfigRequest, ShowMonitorItemViewConfigResponse> genForShowMonitorItemViewConfig() {
        // basic
        HttpRequestDef.Builder<ShowMonitorItemViewConfigRequest, ShowMonitorItemViewConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowMonitorItemViewConfigRequest.class,
                    ShowMonitorItemViewConfigResponse.class)
                .withName("ShowMonitorItemViewConfig")
                .withUri("/v1/apm2/openapi/view/config/get-monitor-item-view-config")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowMonitorItemViewConfigRequest::getEnvId,
                ShowMonitorItemViewConfigRequest::setEnvId));
        builder.<Long>withRequestField("collector_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowMonitorItemViewConfigRequest::getCollectorId,
                ShowMonitorItemViewConfigRequest::setCollectorId));
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowMonitorItemViewConfigRequest::getXBusinessId,
                ShowMonitorItemViewConfigRequest::setXBusinessId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRawTableRequest, ShowRawTableResponse> showRawTable = genForShowRawTable();

    private static HttpRequestDef<ShowRawTableRequest, ShowRawTableResponse> genForShowRawTable() {
        // basic
        HttpRequestDef.Builder<ShowRawTableRequest, ShowRawTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowRawTableRequest.class, ShowRawTableResponse.class)
                .withName("ShowRawTable")
                .withUri("/v1/apm2/openapi/view/metric/raw-table")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowRawTableRequest::getXBusinessId, ShowRawTableRequest::setXBusinessId));
        builder.<RawTableParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RawTableParam.class),
            f -> f.withMarshaller(ShowRawTableRequest::getBody, ShowRawTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSpanSearchRequest, ShowSpanSearchResponse> showSpanSearch =
        genForShowSpanSearch();

    private static HttpRequestDef<ShowSpanSearchRequest, ShowSpanSearchResponse> genForShowSpanSearch() {
        // basic
        HttpRequestDef.Builder<ShowSpanSearchRequest, ShowSpanSearchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowSpanSearchRequest.class, ShowSpanSearchResponse.class)
                .withName("ShowSpanSearch")
                .withUri("/v1/apm2/openapi/view/trace/span-search")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowSpanSearchRequest::getXBusinessId, ShowSpanSearchRequest::setXBusinessId));
        builder.<TraceSearchParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TraceSearchParam.class),
            f -> f.withMarshaller(ShowSpanSearchRequest::getBody, ShowSpanSearchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSumTableRequest, ShowSumTableResponse> showSumTable = genForShowSumTable();

    private static HttpRequestDef<ShowSumTableRequest, ShowSumTableResponse> genForShowSumTable() {
        // basic
        HttpRequestDef.Builder<ShowSumTableRequest, ShowSumTableResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowSumTableRequest.class, ShowSumTableResponse.class)
                .withName("ShowSumTable")
                .withUri("/v1/apm2/openapi/view/metric/sum-table")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowSumTableRequest::getXBusinessId, ShowSumTableRequest::setXBusinessId));
        builder.<SumTableParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SumTableParam.class),
            f -> f.withMarshaller(ShowSumTableRequest::getBody, ShowSumTableRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTopologyRequest, ShowTopologyResponse> showTopology = genForShowTopology();

    private static HttpRequestDef<ShowTopologyRequest, ShowTopologyResponse> genForShowTopology() {
        // basic
        HttpRequestDef.Builder<ShowTopologyRequest, ShowTopologyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTopologyRequest.class, ShowTopologyResponse.class)
                .withName("ShowTopology")
                .withUri("/v1/apm2/openapi/view/trace/topology")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("trace_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopologyRequest::getTraceId, ShowTopologyRequest::setTraceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTraceEventsRequest, ShowTraceEventsResponse> showTraceEvents =
        genForShowTraceEvents();

    private static HttpRequestDef<ShowTraceEventsRequest, ShowTraceEventsResponse> genForShowTraceEvents() {
        // basic
        HttpRequestDef.Builder<ShowTraceEventsRequest, ShowTraceEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTraceEventsRequest.class, ShowTraceEventsResponse.class)
                .withName("ShowTraceEvents")
                .withUri("/v1/apm2/openapi/view/trace/get-trace-events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("trace_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTraceEventsRequest::getTraceId, ShowTraceEventsRequest::setTraceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTrendRequest, ShowTrendResponse> showTrend = genForShowTrend();

    private static HttpRequestDef<ShowTrendRequest, ShowTrendResponse> genForShowTrend() {
        // basic
        HttpRequestDef.Builder<ShowTrendRequest, ShowTrendResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowTrendRequest.class, ShowTrendResponse.class)
                .withName("ShowTrend")
                .withUri("/v1/apm2/openapi/view/metric/trend")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTrendRequest::getXBusinessId, ShowTrendRequest::setXBusinessId));
        builder.<TrendParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TrendParam.class),
            f -> f.withMarshaller(ShowTrendRequest::getBody, ShowTrendRequest::setBody));

        // response

        return builder.build();
    }

}
