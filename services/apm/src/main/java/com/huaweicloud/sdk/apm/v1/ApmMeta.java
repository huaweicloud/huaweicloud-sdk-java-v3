package com.huaweicloud.sdk.apm.v1;

import com.huaweicloud.sdk.apm.v1.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class ApmMeta {

    public static final HttpRequestDef<CreateAkSkRequest, CreateAkSkResponse> createAkSk = genForcreateAkSk();

    private static HttpRequestDef<CreateAkSkRequest, CreateAkSkResponse> genForcreateAkSk() {
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
            f -> f.withMarshaller(CreateAkSkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAkSkRequest, DeleteAkSkResponse> deleteAkSk = genFordeleteAkSk();

    private static HttpRequestDef<DeleteAkSkRequest, DeleteAkSkResponse> genFordeleteAkSk() {
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
            f -> f.withMarshaller(DeleteAkSkRequest::getAk, (req, v) -> {
                req.setAk(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAkSksRequest, ShowAkSksResponse> showAkSks = genForshowAkSks();

    private static HttpRequestDef<ShowAkSksRequest, ShowAkSksResponse> genForshowAkSks() {
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

    public static final HttpRequestDef<ListAkSkRequest, ListAkSkResponse> listAkSk = genForlistAkSk();

    private static HttpRequestDef<ListAkSkRequest, ListAkSkResponse> genForlistAkSk() {
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

    public static final HttpRequestDef<ListBusinessRequest, ListBusinessResponse> listBusiness = genForlistBusiness();

    private static HttpRequestDef<ListBusinessRequest, ListBusinessResponse> genForlistBusiness() {
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
        genForlistEnvMonitorItem();

    private static HttpRequestDef<ListEnvMonitorItemRequest, ListEnvMonitorItemResponse> genForlistEnvMonitorItem() {
        // basic
        HttpRequestDef.Builder<ListEnvMonitorItemRequest, ListEnvMonitorItemResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListEnvMonitorItemRequest.class, ListEnvMonitorItemResponse.class)
                .withName("ListEnvMonitorItem")
                .withUri("/v1/apm2/openapi/apm-service/monitor-item-mgr/get-env-monitor-item-list")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEnvMonitorItemRequest::getXBusinessId, (req, v) -> {
                req.setXBusinessId(v);
            }));
        builder.<GetEnvMonitorItemListParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(GetEnvMonitorItemListParam.class),
            f -> f.withMarshaller(ListEnvMonitorItemRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveMonitorItemConfigRequest, SaveMonitorItemConfigResponse> saveMonitorItemConfig =
        genForsaveMonitorItemConfig();

    private static HttpRequestDef<SaveMonitorItemConfigRequest, SaveMonitorItemConfigResponse> genForsaveMonitorItemConfig() {
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
            f -> f.withMarshaller(SaveMonitorItemConfigRequest::getXBusinessId, (req, v) -> {
                req.setXBusinessId(v);
            }));
        builder.<SaveMonitorItemParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SaveMonitorItemParam.class),
            f -> f.withMarshaller(SaveMonitorItemConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchApplicationRequest, SearchApplicationResponse> searchApplication =
        genForsearchApplication();

    private static HttpRequestDef<SearchApplicationRequest, SearchApplicationResponse> genForsearchApplication() {
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
            f -> f.withMarshaller(SearchApplicationRequest::getXBusinessId, (req, v) -> {
                req.setXBusinessId(v);
            }));
        builder.<AppSearchParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppSearchParam.class),
            f -> f.withMarshaller(SearchApplicationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMasterAddressRequest, ShowMasterAddressResponse> showMasterAddress =
        genForshowMasterAddress();

    private static HttpRequestDef<ShowMasterAddressRequest, ShowMasterAddressResponse> genForshowMasterAddress() {
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
            f -> f.withMarshaller(ShowMasterAddressRequest::getRegionName, (req, v) -> {
                req.setRegionName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppRequest, DeleteAppResponse> deleteApp = genFordeleteApp();

    private static HttpRequestDef<DeleteAppRequest, DeleteAppResponse> genFordeleteApp() {
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
            f -> f.withMarshaller(DeleteAppRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteAppRequest::getXBusinessId, (req, v) -> {
                req.setXBusinessId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnvRequest, DeleteEnvResponse> deleteEnv = genFordeleteEnv();

    private static HttpRequestDef<DeleteEnvRequest, DeleteEnvResponse> genFordeleteEnv() {
        // basic
        HttpRequestDef.Builder<DeleteEnvRequest, DeleteEnvResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEnvRequest.class, DeleteEnvResponse.class)
                .withName("DeleteEnv")
                .withUri("/v1/apm2/openapi/cmdb/envs/delete-env/{env_id}")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("env_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteEnvRequest::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteEnvRequest::getXBusinessId, (req, v) -> {
                req.setXBusinessId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppEnvsRequest, ListAppEnvsResponse> listAppEnvs = genForlistAppEnvs();

    private static HttpRequestDef<ListAppEnvsRequest, ListAppEnvsResponse> genForlistAppEnvs() {
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
            f -> f.withMarshaller(ListAppEnvsRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppEnvsRequest::getXBusinessId, (req, v) -> {
                req.setXBusinessId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppsRequest, ListAppsResponse> listApps = genForlistApps();

    private static HttpRequestDef<ListAppsRequest, ListAppsResponse> genForlistApps() {
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
            f -> f.withMarshaller(ListAppsRequest::getBusinessId, (req, v) -> {
                req.setBusinessId(v);
            }));
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppsRequest::getXBusinessId, (req, v) -> {
                req.setXBusinessId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnvTagsRequest, ListEnvTagsResponse> listEnvTags = genForlistEnvTags();

    private static HttpRequestDef<ListEnvTagsRequest, ListEnvTagsResponse> genForlistEnvTags() {
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
            f -> f.withMarshaller(ListEnvTagsRequest::getXBusinessId, (req, v) -> {
                req.setXBusinessId(v);
            }));
        builder.<TagParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagParam.class),
            f -> f.withMarshaller(ListEnvTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTopologyTreeRequest, ShowTopologyTreeResponse> showTopologyTree =
        genForshowTopologyTree();

    private static HttpRequestDef<ShowTopologyTreeRequest, ShowTopologyTreeResponse> genForshowTopologyTree() {
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
            f -> f.withMarshaller(ShowTopologyTreeRequest::getRegionId, (req, v) -> {
                req.setRegionId(v);
            }));
        builder.<Long>withRequestField("business_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTopologyTreeRequest::getBusinessId, (req, v) -> {
                req.setBusinessId(v);
            }));
        builder.<Long>withRequestField("env_tag_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTopologyTreeRequest::getEnvTagId, (req, v) -> {
                req.setEnvTagId(v);
            }));
        builder.<String>withRequestField("env_keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopologyTreeRequest::getEnvKeyword, (req, v) -> {
                req.setEnvKeyword(v);
            }));
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTopologyTreeRequest::getXBusinessId, (req, v) -> {
                req.setXBusinessId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOpenRegionRequest, ListOpenRegionResponse> listOpenRegion =
        genForlistOpenRegion();

    private static HttpRequestDef<ListOpenRegionRequest, ListOpenRegionResponse> genForlistOpenRegion() {
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
        genForlistSupportedRegion();

    private static HttpRequestDef<ListSupportedRegionRequest, ListSupportedRegionResponse> genForlistSupportedRegion() {
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

    public static final HttpRequestDef<ListEnvInstancesRequest, ListEnvInstancesResponse> listEnvInstances =
        genForlistEnvInstances();

    private static HttpRequestDef<ListEnvInstancesRequest, ListEnvInstancesResponse> genForlistEnvInstances() {
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
            f -> f.withMarshaller(ListEnvInstancesRequest::getXBusinessId, (req, v) -> {
                req.setXBusinessId(v);
            }));
        builder.<InstanceSearchParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceSearchParam.class),
            f -> f.withMarshaller(ListEnvInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClobDetailRequest, ShowClobDetailResponse> showClobDetail =
        genForshowClobDetail();

    private static HttpRequestDef<ShowClobDetailRequest, ShowClobDetailResponse> genForshowClobDetail() {
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
            f -> f.withMarshaller(ShowClobDetailRequest::getXBusinessId, (req, v) -> {
                req.setXBusinessId(v);
            }));
        builder.<GetClobDetailParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetClobDetailParam.class),
            f -> f.withMarshaller(ShowClobDetailRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnvMonitorItemsRequest, ShowEnvMonitorItemsResponse> showEnvMonitorItems =
        genForshowEnvMonitorItems();

    private static HttpRequestDef<ShowEnvMonitorItemsRequest, ShowEnvMonitorItemsResponse> genForshowEnvMonitorItems() {
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
            f -> f.withMarshaller(ShowEnvMonitorItemsRequest::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowEnvMonitorItemsRequest::getXBusinessId, (req, v) -> {
                req.setXBusinessId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEventDetailRequest, ShowEventDetailResponse> showEventDetail =
        genForshowEventDetail();

    private static HttpRequestDef<ShowEventDetailRequest, ShowEventDetailResponse> genForshowEventDetail() {
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
            f -> f.withMarshaller(ShowEventDetailRequest::getTraceId, (req, v) -> {
                req.setTraceId(v);
            }));
        builder.<String>withRequestField("span_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventDetailRequest::getSpanId, (req, v) -> {
                req.setSpanId(v);
            }));
        builder.<String>withRequestField("event_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventDetailRequest::getEventId, (req, v) -> {
                req.setEventId(v);
            }));
        builder.<Long>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowEventDetailRequest::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMonitorItemViewConfigRequest, ShowMonitorItemViewConfigResponse> showMonitorItemViewConfig =
        genForshowMonitorItemViewConfig();

    private static HttpRequestDef<ShowMonitorItemViewConfigRequest, ShowMonitorItemViewConfigResponse> genForshowMonitorItemViewConfig() {
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
            f -> f.withMarshaller(ShowMonitorItemViewConfigRequest::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));
        builder.<Long>withRequestField("collector_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowMonitorItemViewConfigRequest::getCollectorId, (req, v) -> {
                req.setCollectorId(v);
            }));
        builder.<Long>withRequestField("x-business-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowMonitorItemViewConfigRequest::getXBusinessId, (req, v) -> {
                req.setXBusinessId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRawTableRequest, ShowRawTableResponse> showRawTable = genForshowRawTable();

    private static HttpRequestDef<ShowRawTableRequest, ShowRawTableResponse> genForshowRawTable() {
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
            f -> f.withMarshaller(ShowRawTableRequest::getXBusinessId, (req, v) -> {
                req.setXBusinessId(v);
            }));
        builder.<RawTableParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RawTableParam.class),
            f -> f.withMarshaller(ShowRawTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSpanSearchRequest, ShowSpanSearchResponse> showSpanSearch =
        genForshowSpanSearch();

    private static HttpRequestDef<ShowSpanSearchRequest, ShowSpanSearchResponse> genForshowSpanSearch() {
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
            f -> f.withMarshaller(ShowSpanSearchRequest::getXBusinessId, (req, v) -> {
                req.setXBusinessId(v);
            }));
        builder.<TraceSearchParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TraceSearchParam.class),
            f -> f.withMarshaller(ShowSpanSearchRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSumTableRequest, ShowSumTableResponse> showSumTable = genForshowSumTable();

    private static HttpRequestDef<ShowSumTableRequest, ShowSumTableResponse> genForshowSumTable() {
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
            f -> f.withMarshaller(ShowSumTableRequest::getXBusinessId, (req, v) -> {
                req.setXBusinessId(v);
            }));
        builder.<SumTableParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SumTableParam.class),
            f -> f.withMarshaller(ShowSumTableRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTopologyRequest, ShowTopologyResponse> showTopology = genForshowTopology();

    private static HttpRequestDef<ShowTopologyRequest, ShowTopologyResponse> genForshowTopology() {
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
            f -> f.withMarshaller(ShowTopologyRequest::getTraceId, (req, v) -> {
                req.setTraceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTraceEventsRequest, ShowTraceEventsResponse> showTraceEvents =
        genForshowTraceEvents();

    private static HttpRequestDef<ShowTraceEventsRequest, ShowTraceEventsResponse> genForshowTraceEvents() {
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
            f -> f.withMarshaller(ShowTraceEventsRequest::getTraceId, (req, v) -> {
                req.setTraceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTrendRequest, ShowTrendResponse> showTrend = genForshowTrend();

    private static HttpRequestDef<ShowTrendRequest, ShowTrendResponse> genForshowTrend() {
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
            f -> f.withMarshaller(ShowTrendRequest::getXBusinessId, (req, v) -> {
                req.setXBusinessId(v);
            }));
        builder.<TrendParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TrendParam.class),
            f -> f.withMarshaller(ShowTrendRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
