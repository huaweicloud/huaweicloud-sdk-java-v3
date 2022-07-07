package com.huaweicloud.sdk.apm.v1;

import com.huaweicloud.sdk.apm.v1.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class ApmMeta {

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

}
