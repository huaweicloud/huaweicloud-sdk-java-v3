package com.huaweicloud.sdk.ec.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ec.v1.model.AddEcnWithErRequest;
import com.huaweicloud.sdk.ec.v1.model.AddEcnWithErResponse;
import com.huaweicloud.sdk.ec.v1.model.AddEcnWithIegRequest;
import com.huaweicloud.sdk.ec.v1.model.AddEcnWithIegResponse;
import com.huaweicloud.sdk.ec.v1.model.AddVrrpConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.AddVrrpConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.ChangeIegPasswordRequest;
import com.huaweicloud.sdk.ec.v1.model.ChangeIegPasswordResponse;
import com.huaweicloud.sdk.ec.v1.model.ChangePasswordBody;
import com.huaweicloud.sdk.ec.v1.model.CreateAccessPointRequestBody;
import com.huaweicloud.sdk.ec.v1.model.CreateEcnAccessPointRequest;
import com.huaweicloud.sdk.ec.v1.model.CreateEcnAccessPointResponse;
import com.huaweicloud.sdk.ec.v1.model.CreateEquipmentLanConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.CreateEquipmentLanConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.CreateEquipmentRequest;
import com.huaweicloud.sdk.ec.v1.model.CreateEquipmentResponse;
import com.huaweicloud.sdk.ec.v1.model.CreateEquipmentStaticRouteConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.CreateEquipmentStaticRouteConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.CreateUpdateVrrpConfigRequestBody;
import com.huaweicloud.sdk.ec.v1.model.DeleteEcnAccessPointRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteEcnAccessPointResponse;
import com.huaweicloud.sdk.ec.v1.model.DeleteEcnWithErRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteEcnWithErResponse;
import com.huaweicloud.sdk.ec.v1.model.DeleteEcnWithIegRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteEcnWithIegResponse;
import com.huaweicloud.sdk.ec.v1.model.DeleteEquipmentLanConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteEquipmentLanConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.DeleteEquipmentRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteEquipmentResponse;
import com.huaweicloud.sdk.ec.v1.model.DeleteEquipmentStaticRouteConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteEquipmentStaticRouteConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.DeleteVrrpConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteVrrpConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.EcnWithErRequest;
import com.huaweicloud.sdk.ec.v1.model.EcnWithIegRequest;
import com.huaweicloud.sdk.ec.v1.model.EquipmentActivate;
import com.huaweicloud.sdk.ec.v1.model.EquipmentDnsItem;
import com.huaweicloud.sdk.ec.v1.model.EquipmentEsn;
import com.huaweicloud.sdk.ec.v1.model.EquipmentLanItem;
import com.huaweicloud.sdk.ec.v1.model.EquipmentOspfItem;
import com.huaweicloud.sdk.ec.v1.model.EquipmentWanItemList;
import com.huaweicloud.sdk.ec.v1.model.EquipmentWlanItem;
import com.huaweicloud.sdk.ec.v1.model.GenerateInitialConfigurationRequest;
import com.huaweicloud.sdk.ec.v1.model.GenerateInitialConfigurationResponse;
import com.huaweicloud.sdk.ec.v1.model.InitialConfigurationReq;
import com.huaweicloud.sdk.ec.v1.model.ListEcnAccessPointByEcnIdRequest;
import com.huaweicloud.sdk.ec.v1.model.ListEcnAccessPointByEcnIdResponse;
import com.huaweicloud.sdk.ec.v1.model.ListEcnRequest;
import com.huaweicloud.sdk.ec.v1.model.ListEcnResponse;
import com.huaweicloud.sdk.ec.v1.model.ListEcnWithErRequest;
import com.huaweicloud.sdk.ec.v1.model.ListEcnWithErResponse;
import com.huaweicloud.sdk.ec.v1.model.ListEcnWithIegRequest;
import com.huaweicloud.sdk.ec.v1.model.ListEcnWithIegResponse;
import com.huaweicloud.sdk.ec.v1.model.ListEquipmentInterfaceNameRequest;
import com.huaweicloud.sdk.ec.v1.model.ListEquipmentInterfaceNameResponse;
import com.huaweicloud.sdk.ec.v1.model.ListEquipmentsRequest;
import com.huaweicloud.sdk.ec.v1.model.ListEquipmentsResponse;
import com.huaweicloud.sdk.ec.v1.model.ListIegRequest;
import com.huaweicloud.sdk.ec.v1.model.ListIegResponse;
import com.huaweicloud.sdk.ec.v1.model.RebootEquipmentRequest;
import com.huaweicloud.sdk.ec.v1.model.RebootEquipmentResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEcnInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEcnInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEcnWithIegRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEcnWithIegResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentDnsInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentDnsInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentLanInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentLanInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentOspfRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentOspfResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentSpecificConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentSpecificConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentStaticRouteInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentStaticRouteInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentWanInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentWanInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentWlanRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowEquipmentWlanResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowIegInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowIegInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowQuotasInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowQuotasInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.ShowVrrpConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.ShowVrrpConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.StaticRouteItem;
import com.huaweicloud.sdk.ec.v1.model.SwitchEquipmentHaTypeRequest;
import com.huaweicloud.sdk.ec.v1.model.SwitchEquipmentHaTypeResponse;
import com.huaweicloud.sdk.ec.v1.model.SwitchHaTypeBody;
import com.huaweicloud.sdk.ec.v1.model.UpdateAccessPointRequestBody;
import com.huaweicloud.sdk.ec.v1.model.UpdateEcnAccessPointRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEcnAccessPointResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEcnRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEcnRequestBody;
import com.huaweicloud.sdk.ec.v1.model.UpdateEcnResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentDnsInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentDnsInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentEsnRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentEsnResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentInfoBody;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentInfoRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentInfoResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentLanConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentLanConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentOspfRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentOspfResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentStaticRouteConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentStaticRouteConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentWanConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentWanConfigResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentWlanRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEquipmentWlanResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateIegRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateIegRequestBody;
import com.huaweicloud.sdk.ec.v1.model.UpdateIegResponse;
import com.huaweicloud.sdk.ec.v1.model.UpdateVrrpConfigRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateVrrpConfigResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class EcMeta {

    public static final HttpRequestDef<CreateEcnAccessPointRequest, CreateEcnAccessPointResponse> createEcnAccessPoint =
        genForcreateEcnAccessPoint();

    private static HttpRequestDef<CreateEcnAccessPointRequest, CreateEcnAccessPointResponse> genForcreateEcnAccessPoint() {
        // basic
        HttpRequestDef.Builder<CreateEcnAccessPointRequest, CreateEcnAccessPointResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateEcnAccessPointRequest.class, CreateEcnAccessPointResponse.class)
            .withName("CreateEcnAccessPoint")
            .withUri("/v1/{domain_id}/enterprise-connect/enterprise-connect-network/{ecn_id}/access-point")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ecn_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEcnAccessPointRequest::getEcnId, (req, v) -> {
                req.setEcnId(v);
            }));
        builder.<CreateAccessPointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateAccessPointRequestBody.class),
            f -> f.withMarshaller(CreateEcnAccessPointRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEcnAccessPointRequest, DeleteEcnAccessPointResponse> deleteEcnAccessPoint =
        genFordeleteEcnAccessPoint();

    private static HttpRequestDef<DeleteEcnAccessPointRequest, DeleteEcnAccessPointResponse> genFordeleteEcnAccessPoint() {
        // basic
        HttpRequestDef.Builder<DeleteEcnAccessPointRequest, DeleteEcnAccessPointResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEcnAccessPointRequest.class, DeleteEcnAccessPointResponse.class)
            .withName("DeleteEcnAccessPoint")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/enterprise-connect-network/{ecn_id}/access-point/{access_point_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ecn_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEcnAccessPointRequest::getEcnId, (req, v) -> {
                req.setEcnId(v);
            }));
        builder.<String>withRequestField("access_point_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEcnAccessPointRequest::getAccessPointId, (req, v) -> {
                req.setAccessPointId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEcnAccessPointByEcnIdRequest, ListEcnAccessPointByEcnIdResponse> listEcnAccessPointByEcnId =
        genForlistEcnAccessPointByEcnId();

    private static HttpRequestDef<ListEcnAccessPointByEcnIdRequest, ListEcnAccessPointByEcnIdResponse> genForlistEcnAccessPointByEcnId() {
        // basic
        HttpRequestDef.Builder<ListEcnAccessPointByEcnIdRequest, ListEcnAccessPointByEcnIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListEcnAccessPointByEcnIdRequest.class,
                    ListEcnAccessPointByEcnIdResponse.class)
                .withName("ListEcnAccessPointByEcnId")
                .withUri("/v1/{domain_id}/enterprise-connect/enterprise-connect-network/{ecn_id}/access-point")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ecn_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEcnAccessPointByEcnIdRequest::getEcnId, (req, v) -> {
                req.setEcnId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEcnAccessPointRequest, UpdateEcnAccessPointResponse> updateEcnAccessPoint =
        genForupdateEcnAccessPoint();

    private static HttpRequestDef<UpdateEcnAccessPointRequest, UpdateEcnAccessPointResponse> genForupdateEcnAccessPoint() {
        // basic
        HttpRequestDef.Builder<UpdateEcnAccessPointRequest, UpdateEcnAccessPointResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateEcnAccessPointRequest.class, UpdateEcnAccessPointResponse.class)
            .withName("UpdateEcnAccessPoint")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/enterprise-connect-network/{ecn_id}/access-point/{access_point_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ecn_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEcnAccessPointRequest::getEcnId, (req, v) -> {
                req.setEcnId(v);
            }));
        builder.<String>withRequestField("access_point_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEcnAccessPointRequest::getAccessPointId, (req, v) -> {
                req.setAccessPointId(v);
            }));
        builder.<UpdateAccessPointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateAccessPointRequestBody.class),
            f -> f.withMarshaller(UpdateEcnAccessPointRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddEcnWithIegRequest, AddEcnWithIegResponse> addEcnWithIeg =
        genForaddEcnWithIeg();

    private static HttpRequestDef<AddEcnWithIegRequest, AddEcnWithIegResponse> genForaddEcnWithIeg() {
        // basic
        HttpRequestDef.Builder<AddEcnWithIegRequest, AddEcnWithIegResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddEcnWithIegRequest.class, AddEcnWithIegResponse.class)
            .withName("AddEcnWithIeg")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/enterprise-connect-network/{ecn_id}/relationship/intelligent-enterprise-gateway")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ecn_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddEcnWithIegRequest::getEcnId, (req, v) -> {
                req.setEcnId(v);
            }));
        builder.<EcnWithIegRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EcnWithIegRequest.class),
            f -> f.withMarshaller(AddEcnWithIegRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEcnWithIegRequest, DeleteEcnWithIegResponse> deleteEcnWithIeg =
        genFordeleteEcnWithIeg();

    private static HttpRequestDef<DeleteEcnWithIegRequest, DeleteEcnWithIegResponse> genFordeleteEcnWithIeg() {
        // basic
        HttpRequestDef.Builder<DeleteEcnWithIegRequest, DeleteEcnWithIegResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEcnWithIegRequest.class, DeleteEcnWithIegResponse.class)
            .withName("DeleteEcnWithIeg")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/enterprise-connect-network/{ecn_id}/relationship/intelligent-enterprise-gateway/{relation_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ecn_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEcnWithIegRequest::getEcnId, (req, v) -> {
                req.setEcnId(v);
            }));
        builder.<String>withRequestField("relation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEcnWithIegRequest::getRelationId, (req, v) -> {
                req.setRelationId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEcnRequest, ListEcnResponse> listEcn = genForlistEcn();

    private static HttpRequestDef<ListEcnRequest, ListEcnResponse> genForlistEcn() {
        // basic
        HttpRequestDef.Builder<ListEcnRequest, ListEcnResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEcnRequest.class, ListEcnResponse.class)
                .withName("ListEcn")
                .withUri("/v1/{domain_id}/enterprise-connect/enterprise-connect-network")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEcnRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEcnRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEcnRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEcnWithIegRequest, ListEcnWithIegResponse> listEcnWithIeg =
        genForlistEcnWithIeg();

    private static HttpRequestDef<ListEcnWithIegRequest, ListEcnWithIegResponse> genForlistEcnWithIeg() {
        // basic
        HttpRequestDef.Builder<ListEcnWithIegRequest, ListEcnWithIegResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEcnWithIegRequest.class, ListEcnWithIegResponse.class)
            .withName("ListEcnWithIeg")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/enterprise-connect-network/{ecn_id}/relationship/intelligent-enterprise-gateway")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ecn_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEcnWithIegRequest::getEcnId, (req, v) -> {
                req.setEcnId(v);
            }));
        builder.<String>withRequestField("ieg_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEcnWithIegRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEcnInfoRequest, ShowEcnInfoResponse> showEcnInfo = genForshowEcnInfo();

    private static HttpRequestDef<ShowEcnInfoRequest, ShowEcnInfoResponse> genForshowEcnInfo() {
        // basic
        HttpRequestDef.Builder<ShowEcnInfoRequest, ShowEcnInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEcnInfoRequest.class, ShowEcnInfoResponse.class)
                .withName("ShowEcnInfo")
                .withUri("/v1/{domain_id}/enterprise-connect/enterprise-connect-network/{ecn_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ecn_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEcnInfoRequest::getEcnId, (req, v) -> {
                req.setEcnId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEcnWithIegRequest, ShowEcnWithIegResponse> showEcnWithIeg =
        genForshowEcnWithIeg();

    private static HttpRequestDef<ShowEcnWithIegRequest, ShowEcnWithIegResponse> genForshowEcnWithIeg() {
        // basic
        HttpRequestDef.Builder<ShowEcnWithIegRequest, ShowEcnWithIegResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEcnWithIegRequest.class, ShowEcnWithIegResponse.class)
            .withName("ShowEcnWithIeg")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/enterprise-connect-network/{ecn_id}/relationship/intelligent-enterprise-gateway/{relation_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ecn_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEcnWithIegRequest::getEcnId, (req, v) -> {
                req.setEcnId(v);
            }));
        builder.<String>withRequestField("relation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEcnWithIegRequest::getRelationId, (req, v) -> {
                req.setRelationId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEcnRequest, UpdateEcnResponse> updateEcn = genForupdateEcn();

    private static HttpRequestDef<UpdateEcnRequest, UpdateEcnResponse> genForupdateEcn() {
        // basic
        HttpRequestDef.Builder<UpdateEcnRequest, UpdateEcnResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEcnRequest.class, UpdateEcnResponse.class)
                .withName("UpdateEcn")
                .withUri("/v1/{domain_id}/enterprise-connect/enterprise-connect-network/{ecn_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ecn_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEcnRequest::getEcnId, (req, v) -> {
                req.setEcnId(v);
            }));
        builder.<UpdateEcnRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateEcnRequestBody.class),
            f -> f.withMarshaller(UpdateEcnRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEquipmentRequest, CreateEquipmentResponse> createEquipment =
        genForcreateEquipment();

    private static HttpRequestDef<CreateEquipmentRequest, CreateEquipmentResponse> genForcreateEquipment() {
        // basic
        HttpRequestDef.Builder<CreateEquipmentRequest, CreateEquipmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEquipmentRequest.class, CreateEquipmentResponse.class)
                .withName("CreateEquipment")
                .withUri("/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEquipmentRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<EquipmentActivate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EquipmentActivate.class),
            f -> f.withMarshaller(CreateEquipmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEquipmentRequest, DeleteEquipmentResponse> deleteEquipment =
        genFordeleteEquipment();

    private static HttpRequestDef<DeleteEquipmentRequest, DeleteEquipmentResponse> genFordeleteEquipment() {
        // basic
        HttpRequestDef.Builder<DeleteEquipmentRequest, DeleteEquipmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEquipmentRequest.class, DeleteEquipmentResponse.class)
            .withName("DeleteEquipment")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEquipmentRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEquipmentRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GenerateInitialConfigurationRequest, GenerateInitialConfigurationResponse> generateInitialConfiguration =
        genForgenerateInitialConfiguration();

    private static HttpRequestDef<GenerateInitialConfigurationRequest, GenerateInitialConfigurationResponse> genForgenerateInitialConfiguration() {
        // basic
        HttpRequestDef.Builder<GenerateInitialConfigurationRequest, GenerateInitialConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    GenerateInitialConfigurationRequest.class,
                    GenerateInitialConfigurationResponse.class)
                .withName("GenerateInitialConfiguration")
                .withUri(
                    "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}/initial-configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GenerateInitialConfigurationRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GenerateInitialConfigurationRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));
        builder.<InitialConfigurationReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InitialConfigurationReq.class),
            f -> f.withMarshaller(GenerateInitialConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEquipmentsRequest, ListEquipmentsResponse> listEquipments =
        genForlistEquipments();

    private static HttpRequestDef<ListEquipmentsRequest, ListEquipmentsResponse> genForlistEquipments() {
        // basic
        HttpRequestDef.Builder<ListEquipmentsRequest, ListEquipmentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEquipmentsRequest.class, ListEquipmentsResponse.class)
                .withName("ListEquipments")
                .withUri("/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEquipmentsRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RebootEquipmentRequest, RebootEquipmentResponse> rebootEquipment =
        genForrebootEquipment();

    private static HttpRequestDef<RebootEquipmentRequest, RebootEquipmentResponse> genForrebootEquipment() {
        // basic
        HttpRequestDef.Builder<RebootEquipmentRequest, RebootEquipmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RebootEquipmentRequest.class, RebootEquipmentResponse.class)
            .withName("RebootEquipment")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}/reboot")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RebootEquipmentRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RebootEquipmentRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEquipmentInfoRequest, ShowEquipmentInfoResponse> showEquipmentInfo =
        genForshowEquipmentInfo();

    private static HttpRequestDef<ShowEquipmentInfoRequest, ShowEquipmentInfoResponse> genForshowEquipmentInfo() {
        // basic
        HttpRequestDef.Builder<ShowEquipmentInfoRequest, ShowEquipmentInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEquipmentInfoRequest.class, ShowEquipmentInfoResponse.class)
            .withName("ShowEquipmentInfo")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentInfoRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentInfoRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEquipmentSpecificConfigRequest, ShowEquipmentSpecificConfigResponse> showEquipmentSpecificConfig =
        genForshowEquipmentSpecificConfig();

    private static HttpRequestDef<ShowEquipmentSpecificConfigRequest, ShowEquipmentSpecificConfigResponse> genForshowEquipmentSpecificConfig() {
        // basic
        HttpRequestDef.Builder<ShowEquipmentSpecificConfigRequest, ShowEquipmentSpecificConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowEquipmentSpecificConfigRequest.class,
                    ShowEquipmentSpecificConfigResponse.class)
                .withName("ShowEquipmentSpecificConfig")
                .withUri("/v1/{domain_id}/enterprise-connect/equipment-specification/{equipment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentSpecificConfigRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEquipmentEsnRequest, UpdateEquipmentEsnResponse> updateEquipmentEsn =
        genForupdateEquipmentEsn();

    private static HttpRequestDef<UpdateEquipmentEsnRequest, UpdateEquipmentEsnResponse> genForupdateEquipmentEsn() {
        // basic
        HttpRequestDef.Builder<UpdateEquipmentEsnRequest, UpdateEquipmentEsnResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateEquipmentEsnRequest.class, UpdateEquipmentEsnResponse.class)
            .withName("UpdateEquipmentEsn")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}/esn")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentEsnRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentEsnRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));
        builder.<EquipmentEsn>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EquipmentEsn.class),
            f -> f.withMarshaller(UpdateEquipmentEsnRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEquipmentInfoRequest, UpdateEquipmentInfoResponse> updateEquipmentInfo =
        genForupdateEquipmentInfo();

    private static HttpRequestDef<UpdateEquipmentInfoRequest, UpdateEquipmentInfoResponse> genForupdateEquipmentInfo() {
        // basic
        HttpRequestDef.Builder<UpdateEquipmentInfoRequest, UpdateEquipmentInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateEquipmentInfoRequest.class, UpdateEquipmentInfoResponse.class)
            .withName("UpdateEquipmentInfo")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentInfoRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentInfoRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));
        builder.<UpdateEquipmentInfoBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEquipmentInfoBody.class),
            f -> f.withMarshaller(UpdateEquipmentInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEquipmentLanConfigRequest, CreateEquipmentLanConfigResponse> createEquipmentLanConfig =
        genForcreateEquipmentLanConfig();

    private static HttpRequestDef<CreateEquipmentLanConfigRequest, CreateEquipmentLanConfigResponse> genForcreateEquipmentLanConfig() {
        // basic
        HttpRequestDef.Builder<CreateEquipmentLanConfigRequest, CreateEquipmentLanConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateEquipmentLanConfigRequest.class, CreateEquipmentLanConfigResponse.class)
                .withName("CreateEquipmentLanConfig")
                .withUri(
                    "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}/lan-interface")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEquipmentLanConfigRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEquipmentLanConfigRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));
        builder.<EquipmentLanItem>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EquipmentLanItem.class),
            f -> f.withMarshaller(CreateEquipmentLanConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEquipmentLanConfigRequest, DeleteEquipmentLanConfigResponse> deleteEquipmentLanConfig =
        genFordeleteEquipmentLanConfig();

    private static HttpRequestDef<DeleteEquipmentLanConfigRequest, DeleteEquipmentLanConfigResponse> genFordeleteEquipmentLanConfig() {
        // basic
        HttpRequestDef.Builder<DeleteEquipmentLanConfigRequest, DeleteEquipmentLanConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteEquipmentLanConfigRequest.class,
                    DeleteEquipmentLanConfigResponse.class)
                .withName("DeleteEquipmentLanConfig")
                .withUri(
                    "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}/lan-interface")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEquipmentLanConfigRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEquipmentLanConfigRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));
        builder.<String>withRequestField("interface_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEquipmentLanConfigRequest::getInterfaceName, (req, v) -> {
                req.setInterfaceName(v);
            }));
        builder.<String>withRequestField("vlan_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEquipmentLanConfigRequest::getVlanId, (req, v) -> {
                req.setVlanId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEquipmentInterfaceNameRequest, ListEquipmentInterfaceNameResponse> listEquipmentInterfaceName =
        genForlistEquipmentInterfaceName();

    private static HttpRequestDef<ListEquipmentInterfaceNameRequest, ListEquipmentInterfaceNameResponse> genForlistEquipmentInterfaceName() {
        // basic
        HttpRequestDef.Builder<ListEquipmentInterfaceNameRequest, ListEquipmentInterfaceNameResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListEquipmentInterfaceNameRequest.class,
                    ListEquipmentInterfaceNameResponse.class)
                .withName("ListEquipmentInterfaceName")
                .withUri(
                    "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}/interface-name")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEquipmentInterfaceNameRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEquipmentInterfaceNameRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEquipmentDnsInfoRequest, ShowEquipmentDnsInfoResponse> showEquipmentDnsInfo =
        genForshowEquipmentDnsInfo();

    private static HttpRequestDef<ShowEquipmentDnsInfoRequest, ShowEquipmentDnsInfoResponse> genForshowEquipmentDnsInfo() {
        // basic
        HttpRequestDef.Builder<ShowEquipmentDnsInfoRequest, ShowEquipmentDnsInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEquipmentDnsInfoRequest.class, ShowEquipmentDnsInfoResponse.class)
            .withName("ShowEquipmentDnsInfo")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}/lan-interface/dns")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentDnsInfoRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentDnsInfoRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEquipmentLanInfoRequest, ShowEquipmentLanInfoResponse> showEquipmentLanInfo =
        genForshowEquipmentLanInfo();

    private static HttpRequestDef<ShowEquipmentLanInfoRequest, ShowEquipmentLanInfoResponse> genForshowEquipmentLanInfo() {
        // basic
        HttpRequestDef.Builder<ShowEquipmentLanInfoRequest, ShowEquipmentLanInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEquipmentLanInfoRequest.class, ShowEquipmentLanInfoResponse.class)
            .withName("ShowEquipmentLanInfo")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}/lan-interface")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentLanInfoRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentLanInfoRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEquipmentDnsInfoRequest, UpdateEquipmentDnsInfoResponse> updateEquipmentDnsInfo =
        genForupdateEquipmentDnsInfo();

    private static HttpRequestDef<UpdateEquipmentDnsInfoRequest, UpdateEquipmentDnsInfoResponse> genForupdateEquipmentDnsInfo() {
        // basic
        HttpRequestDef.Builder<UpdateEquipmentDnsInfoRequest, UpdateEquipmentDnsInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateEquipmentDnsInfoRequest.class, UpdateEquipmentDnsInfoResponse.class)
            .withName("UpdateEquipmentDnsInfo")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}/lan-interface/dns")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentDnsInfoRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentDnsInfoRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));
        builder.<EquipmentDnsItem>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EquipmentDnsItem.class),
            f -> f.withMarshaller(UpdateEquipmentDnsInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEquipmentLanConfigRequest, UpdateEquipmentLanConfigResponse> updateEquipmentLanConfig =
        genForupdateEquipmentLanConfig();

    private static HttpRequestDef<UpdateEquipmentLanConfigRequest, UpdateEquipmentLanConfigResponse> genForupdateEquipmentLanConfig() {
        // basic
        HttpRequestDef.Builder<UpdateEquipmentLanConfigRequest, UpdateEquipmentLanConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateEquipmentLanConfigRequest.class, UpdateEquipmentLanConfigResponse.class)
                .withName("UpdateEquipmentLanConfig")
                .withUri(
                    "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}/lan-interface")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentLanConfigRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentLanConfigRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));
        builder.<EquipmentLanItem>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EquipmentLanItem.class),
            f -> f.withMarshaller(UpdateEquipmentLanConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEquipmentOspfRequest, ShowEquipmentOspfResponse> showEquipmentOspf =
        genForshowEquipmentOspf();

    private static HttpRequestDef<ShowEquipmentOspfRequest, ShowEquipmentOspfResponse> genForshowEquipmentOspf() {
        // basic
        HttpRequestDef.Builder<ShowEquipmentOspfRequest, ShowEquipmentOspfResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEquipmentOspfRequest.class, ShowEquipmentOspfResponse.class)
            .withName("ShowEquipmentOspf")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}/ospf")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentOspfRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentOspfRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEquipmentOspfRequest, UpdateEquipmentOspfResponse> updateEquipmentOspf =
        genForupdateEquipmentOspf();

    private static HttpRequestDef<UpdateEquipmentOspfRequest, UpdateEquipmentOspfResponse> genForupdateEquipmentOspf() {
        // basic
        HttpRequestDef.Builder<UpdateEquipmentOspfRequest, UpdateEquipmentOspfResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateEquipmentOspfRequest.class, UpdateEquipmentOspfResponse.class)
            .withName("UpdateEquipmentOspf")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}/ospf")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentOspfRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentOspfRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));
        builder.<EquipmentOspfItem>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EquipmentOspfItem.class),
            f -> f.withMarshaller(UpdateEquipmentOspfRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEquipmentStaticRouteConfigRequest, CreateEquipmentStaticRouteConfigResponse> createEquipmentStaticRouteConfig =
        genForcreateEquipmentStaticRouteConfig();

    private static HttpRequestDef<CreateEquipmentStaticRouteConfigRequest, CreateEquipmentStaticRouteConfigResponse> genForcreateEquipmentStaticRouteConfig() {
        // basic
        HttpRequestDef.Builder<CreateEquipmentStaticRouteConfigRequest, CreateEquipmentStaticRouteConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateEquipmentStaticRouteConfigRequest.class,
                    CreateEquipmentStaticRouteConfigResponse.class)
                .withName("CreateEquipmentStaticRouteConfig")
                .withUri(
                    "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}/static-route")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEquipmentStaticRouteConfigRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEquipmentStaticRouteConfigRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));
        builder.<StaticRouteItem>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StaticRouteItem.class),
            f -> f.withMarshaller(CreateEquipmentStaticRouteConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEquipmentStaticRouteConfigRequest, DeleteEquipmentStaticRouteConfigResponse> deleteEquipmentStaticRouteConfig =
        genFordeleteEquipmentStaticRouteConfig();

    private static HttpRequestDef<DeleteEquipmentStaticRouteConfigRequest, DeleteEquipmentStaticRouteConfigResponse> genFordeleteEquipmentStaticRouteConfig() {
        // basic
        HttpRequestDef.Builder<DeleteEquipmentStaticRouteConfigRequest, DeleteEquipmentStaticRouteConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteEquipmentStaticRouteConfigRequest.class,
                    DeleteEquipmentStaticRouteConfigResponse.class)
                .withName("DeleteEquipmentStaticRouteConfig")
                .withUri(
                    "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}/static-route")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEquipmentStaticRouteConfigRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEquipmentStaticRouteConfigRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));
        builder.<String>withRequestField("prefix",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEquipmentStaticRouteConfigRequest::getPrefix, (req, v) -> {
                req.setPrefix(v);
            }));
        builder.<String>withRequestField("next_hop",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEquipmentStaticRouteConfigRequest::getNextHop, (req, v) -> {
                req.setNextHop(v);
            }));
        builder.<String>withRequestField("interface_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEquipmentStaticRouteConfigRequest::getInterfaceName, (req, v) -> {
                req.setInterfaceName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEquipmentStaticRouteInfoRequest, ShowEquipmentStaticRouteInfoResponse> showEquipmentStaticRouteInfo =
        genForshowEquipmentStaticRouteInfo();

    private static HttpRequestDef<ShowEquipmentStaticRouteInfoRequest, ShowEquipmentStaticRouteInfoResponse> genForshowEquipmentStaticRouteInfo() {
        // basic
        HttpRequestDef.Builder<ShowEquipmentStaticRouteInfoRequest, ShowEquipmentStaticRouteInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowEquipmentStaticRouteInfoRequest.class,
                    ShowEquipmentStaticRouteInfoResponse.class)
                .withName("ShowEquipmentStaticRouteInfo")
                .withUri(
                    "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}/static-route")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentStaticRouteInfoRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentStaticRouteInfoRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEquipmentStaticRouteConfigRequest, UpdateEquipmentStaticRouteConfigResponse> updateEquipmentStaticRouteConfig =
        genForupdateEquipmentStaticRouteConfig();

    private static HttpRequestDef<UpdateEquipmentStaticRouteConfigRequest, UpdateEquipmentStaticRouteConfigResponse> genForupdateEquipmentStaticRouteConfig() {
        // basic
        HttpRequestDef.Builder<UpdateEquipmentStaticRouteConfigRequest, UpdateEquipmentStaticRouteConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateEquipmentStaticRouteConfigRequest.class,
                    UpdateEquipmentStaticRouteConfigResponse.class)
                .withName("UpdateEquipmentStaticRouteConfig")
                .withUri(
                    "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}/static-route")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentStaticRouteConfigRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentStaticRouteConfigRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));
        builder.<StaticRouteItem>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StaticRouteItem.class),
            f -> f.withMarshaller(UpdateEquipmentStaticRouteConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEquipmentWanInfoRequest, ShowEquipmentWanInfoResponse> showEquipmentWanInfo =
        genForshowEquipmentWanInfo();

    private static HttpRequestDef<ShowEquipmentWanInfoRequest, ShowEquipmentWanInfoResponse> genForshowEquipmentWanInfo() {
        // basic
        HttpRequestDef.Builder<ShowEquipmentWanInfoRequest, ShowEquipmentWanInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEquipmentWanInfoRequest.class, ShowEquipmentWanInfoResponse.class)
            .withName("ShowEquipmentWanInfo")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}/wan-interface")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentWanInfoRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentWanInfoRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEquipmentWanConfigRequest, UpdateEquipmentWanConfigResponse> updateEquipmentWanConfig =
        genForupdateEquipmentWanConfig();

    private static HttpRequestDef<UpdateEquipmentWanConfigRequest, UpdateEquipmentWanConfigResponse> genForupdateEquipmentWanConfig() {
        // basic
        HttpRequestDef.Builder<UpdateEquipmentWanConfigRequest, UpdateEquipmentWanConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateEquipmentWanConfigRequest.class, UpdateEquipmentWanConfigResponse.class)
                .withName("UpdateEquipmentWanConfig")
                .withUri(
                    "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}/wan-interface")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentWanConfigRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentWanConfigRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));
        builder.<EquipmentWanItemList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EquipmentWanItemList.class),
            f -> f.withMarshaller(UpdateEquipmentWanConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEquipmentWlanRequest, ShowEquipmentWlanResponse> showEquipmentWlan =
        genForshowEquipmentWlan();

    private static HttpRequestDef<ShowEquipmentWlanRequest, ShowEquipmentWlanResponse> genForshowEquipmentWlan() {
        // basic
        HttpRequestDef.Builder<ShowEquipmentWlanRequest, ShowEquipmentWlanResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEquipmentWlanRequest.class, ShowEquipmentWlanResponse.class)
            .withName("ShowEquipmentWlan")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}/wlan")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentWlanRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentWlanRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEquipmentWlanRequest, UpdateEquipmentWlanResponse> updateEquipmentWlan =
        genForupdateEquipmentWlan();

    private static HttpRequestDef<UpdateEquipmentWlanRequest, UpdateEquipmentWlanResponse> genForupdateEquipmentWlan() {
        // basic
        HttpRequestDef.Builder<UpdateEquipmentWlanRequest, UpdateEquipmentWlanResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateEquipmentWlanRequest.class, UpdateEquipmentWlanResponse.class)
            .withName("UpdateEquipmentWlan")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/equipment/{equipment_id}/wlan")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentWlanRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentWlanRequest::getEquipmentId, (req, v) -> {
                req.setEquipmentId(v);
            }));
        builder.<EquipmentWlanItem>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EquipmentWlanItem.class),
            f -> f.withMarshaller(UpdateEquipmentWlanRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddEcnWithErRequest, AddEcnWithErResponse> addEcnWithEr = genForaddEcnWithEr();

    private static HttpRequestDef<AddEcnWithErRequest, AddEcnWithErResponse> genForaddEcnWithEr() {
        // basic
        HttpRequestDef.Builder<AddEcnWithErRequest, AddEcnWithErResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddEcnWithErRequest.class, AddEcnWithErResponse.class)
            .withName("AddEcnWithEr")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/enterprise-connect-network/{ecn_id}/relationship/enterprise-router")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ecn_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddEcnWithErRequest::getEcnId, (req, v) -> {
                req.setEcnId(v);
            }));
        builder.<EcnWithErRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EcnWithErRequest.class),
            f -> f.withMarshaller(AddEcnWithErRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEcnWithErRequest, DeleteEcnWithErResponse> deleteEcnWithEr =
        genFordeleteEcnWithEr();

    private static HttpRequestDef<DeleteEcnWithErRequest, DeleteEcnWithErResponse> genFordeleteEcnWithEr() {
        // basic
        HttpRequestDef.Builder<DeleteEcnWithErRequest, DeleteEcnWithErResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEcnWithErRequest.class, DeleteEcnWithErResponse.class)
            .withName("DeleteEcnWithEr")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/enterprise-connect-network/{ecn_id}/relationship/enterprise-router/{relation_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ecn_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEcnWithErRequest::getEcnId, (req, v) -> {
                req.setEcnId(v);
            }));
        builder.<String>withRequestField("relation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEcnWithErRequest::getRelationId, (req, v) -> {
                req.setRelationId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEcnWithErRequest, ListEcnWithErResponse> listEcnWithEr =
        genForlistEcnWithEr();

    private static HttpRequestDef<ListEcnWithErRequest, ListEcnWithErResponse> genForlistEcnWithEr() {
        // basic
        HttpRequestDef.Builder<ListEcnWithErRequest, ListEcnWithErResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEcnWithErRequest.class, ListEcnWithErResponse.class)
            .withName("ListEcnWithEr")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/enterprise-connect-network/{ecn_id}/relationship/enterprise-router")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ecn_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEcnWithErRequest::getEcnId, (req, v) -> {
                req.setEcnId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeIegPasswordRequest, ChangeIegPasswordResponse> changeIegPassword =
        genForchangeIegPassword();

    private static HttpRequestDef<ChangeIegPasswordRequest, ChangeIegPasswordResponse> genForchangeIegPassword() {
        // basic
        HttpRequestDef.Builder<ChangeIegPasswordRequest, ChangeIegPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeIegPasswordRequest.class, ChangeIegPasswordResponse.class)
                .withName("ChangeIegPassword")
                .withUri("/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/password")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeIegPasswordRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<ChangePasswordBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangePasswordBody.class),
            f -> f.withMarshaller(ChangeIegPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIegRequest, ListIegResponse> listIeg = genForlistIeg();

    private static HttpRequestDef<ListIegRequest, ListIegResponse> genForlistIeg() {
        // basic
        HttpRequestDef.Builder<ListIegRequest, ListIegResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIegRequest.class, ListIegResponse.class)
                .withName("ListIeg")
                .withUri("/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIegRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIegRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListIegRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIegInfoRequest, ShowIegInfoResponse> showIegInfo = genForshowIegInfo();

    private static HttpRequestDef<ShowIegInfoRequest, ShowIegInfoResponse> genForshowIegInfo() {
        // basic
        HttpRequestDef.Builder<ShowIegInfoRequest, ShowIegInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIegInfoRequest.class, ShowIegInfoResponse.class)
                .withName("ShowIegInfo")
                .withUri("/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIegInfoRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchEquipmentHaTypeRequest, SwitchEquipmentHaTypeResponse> switchEquipmentHaType =
        genForswitchEquipmentHaType();

    private static HttpRequestDef<SwitchEquipmentHaTypeRequest, SwitchEquipmentHaTypeResponse> genForswitchEquipmentHaType() {
        // basic
        HttpRequestDef.Builder<SwitchEquipmentHaTypeRequest, SwitchEquipmentHaTypeResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, SwitchEquipmentHaTypeRequest.class, SwitchEquipmentHaTypeResponse.class)
            .withName("SwitchEquipmentHaType")
            .withUri("/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/switch-ha-type")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchEquipmentHaTypeRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<SwitchHaTypeBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchHaTypeBody.class),
            f -> f.withMarshaller(SwitchEquipmentHaTypeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIegRequest, UpdateIegResponse> updateIeg = genForupdateIeg();

    private static HttpRequestDef<UpdateIegRequest, UpdateIegResponse> genForupdateIeg() {
        // basic
        HttpRequestDef.Builder<UpdateIegRequest, UpdateIegResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIegRequest.class, UpdateIegResponse.class)
                .withName("UpdateIeg")
                .withUri("/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIegRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<UpdateIegRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateIegRequestBody.class),
            f -> f.withMarshaller(UpdateIegRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasInfoRequest, ShowQuotasInfoResponse> showQuotasInfo =
        genForshowQuotasInfo();

    private static HttpRequestDef<ShowQuotasInfoRequest, ShowQuotasInfoResponse> genForshowQuotasInfo() {
        // basic
        HttpRequestDef.Builder<ShowQuotasInfoRequest, ShowQuotasInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotasInfoRequest.class, ShowQuotasInfoResponse.class)
                .withName("ShowQuotasInfo")
                .withUri("/v1/enterprise-connect/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddVrrpConfigRequest, AddVrrpConfigResponse> addVrrpConfig =
        genForaddVrrpConfig();

    private static HttpRequestDef<AddVrrpConfigRequest, AddVrrpConfigResponse> genForaddVrrpConfig() {
        // basic
        HttpRequestDef.Builder<AddVrrpConfigRequest, AddVrrpConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddVrrpConfigRequest.class, AddVrrpConfigResponse.class)
                .withName("AddVrrpConfig")
                .withUri("/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/vrrp-config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddVrrpConfigRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<CreateUpdateVrrpConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateUpdateVrrpConfigRequestBody.class),
            f -> f.withMarshaller(AddVrrpConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVrrpConfigRequest, DeleteVrrpConfigResponse> deleteVrrpConfig =
        genFordeleteVrrpConfig();

    private static HttpRequestDef<DeleteVrrpConfigRequest, DeleteVrrpConfigResponse> genFordeleteVrrpConfig() {
        // basic
        HttpRequestDef.Builder<DeleteVrrpConfigRequest, DeleteVrrpConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteVrrpConfigRequest.class, DeleteVrrpConfigResponse.class)
            .withName("DeleteVrrpConfig")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/vrrp-config/{virtual_router_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVrrpConfigRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<Integer>withRequestField("virtual_router_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteVrrpConfigRequest::getVirtualRouterId, (req, v) -> {
                req.setVirtualRouterId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVrrpConfigRequest, ShowVrrpConfigResponse> showVrrpConfig =
        genForshowVrrpConfig();

    private static HttpRequestDef<ShowVrrpConfigRequest, ShowVrrpConfigResponse> genForshowVrrpConfig() {
        // basic
        HttpRequestDef.Builder<ShowVrrpConfigRequest, ShowVrrpConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVrrpConfigRequest.class, ShowVrrpConfigResponse.class)
                .withName("ShowVrrpConfig")
                .withUri("/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/vrrp-config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVrrpConfigRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVrrpConfigRequest, UpdateVrrpConfigResponse> updateVrrpConfig =
        genForupdateVrrpConfig();

    private static HttpRequestDef<UpdateVrrpConfigRequest, UpdateVrrpConfigResponse> genForupdateVrrpConfig() {
        // basic
        HttpRequestDef.Builder<UpdateVrrpConfigRequest, UpdateVrrpConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateVrrpConfigRequest.class, UpdateVrrpConfigResponse.class)
            .withName("UpdateVrrpConfig")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/intelligent-enterprise-gateway/{ieg_id}/vrrp-config/{virtual_router_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ieg_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVrrpConfigRequest::getIegId, (req, v) -> {
                req.setIegId(v);
            }));
        builder.<Integer>withRequestField("virtual_router_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateVrrpConfigRequest::getVirtualRouterId, (req, v) -> {
                req.setVirtualRouterId(v);
            }));
        builder.<CreateUpdateVrrpConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateUpdateVrrpConfigRequestBody.class),
            f -> f.withMarshaller(UpdateVrrpConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
