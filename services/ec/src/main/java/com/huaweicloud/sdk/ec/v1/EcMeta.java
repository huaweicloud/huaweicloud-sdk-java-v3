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
import com.huaweicloud.sdk.ec.v1.model.AddEcnWithVpcRequest;
import com.huaweicloud.sdk.ec.v1.model.AddEcnWithVpcRequestBody;
import com.huaweicloud.sdk.ec.v1.model.AddEcnWithVpcResponse;
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
import com.huaweicloud.sdk.ec.v1.model.DeleteEcnWithVpcRequest;
import com.huaweicloud.sdk.ec.v1.model.DeleteEcnWithVpcResponse;
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
import com.huaweicloud.sdk.ec.v1.model.ListEcnWithVpcRequest;
import com.huaweicloud.sdk.ec.v1.model.ListEcnWithVpcResponse;
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
import com.huaweicloud.sdk.ec.v1.model.UpdateEcnWithVpcRequest;
import com.huaweicloud.sdk.ec.v1.model.UpdateEcnWithVpcRequestBody;
import com.huaweicloud.sdk.ec.v1.model.UpdateEcnWithVpcResponse;
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
        genForCreateEcnAccessPoint();

    private static HttpRequestDef<CreateEcnAccessPointRequest, CreateEcnAccessPointResponse> genForCreateEcnAccessPoint() {
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
            f -> f.withMarshaller(CreateEcnAccessPointRequest::getEcnId, CreateEcnAccessPointRequest::setEcnId));
        builder.<CreateAccessPointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateAccessPointRequestBody.class),
            f -> f.withMarshaller(CreateEcnAccessPointRequest::getBody, CreateEcnAccessPointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEcnAccessPointRequest, DeleteEcnAccessPointResponse> deleteEcnAccessPoint =
        genForDeleteEcnAccessPoint();

    private static HttpRequestDef<DeleteEcnAccessPointRequest, DeleteEcnAccessPointResponse> genForDeleteEcnAccessPoint() {
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
            f -> f.withMarshaller(DeleteEcnAccessPointRequest::getEcnId, DeleteEcnAccessPointRequest::setEcnId));
        builder.<String>withRequestField("access_point_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEcnAccessPointRequest::getAccessPointId,
                DeleteEcnAccessPointRequest::setAccessPointId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEcnAccessPointByEcnIdRequest, ListEcnAccessPointByEcnIdResponse> listEcnAccessPointByEcnId =
        genForListEcnAccessPointByEcnId();

    private static HttpRequestDef<ListEcnAccessPointByEcnIdRequest, ListEcnAccessPointByEcnIdResponse> genForListEcnAccessPointByEcnId() {
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
            f -> f.withMarshaller(ListEcnAccessPointByEcnIdRequest::getEcnId,
                ListEcnAccessPointByEcnIdRequest::setEcnId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEcnAccessPointRequest, UpdateEcnAccessPointResponse> updateEcnAccessPoint =
        genForUpdateEcnAccessPoint();

    private static HttpRequestDef<UpdateEcnAccessPointRequest, UpdateEcnAccessPointResponse> genForUpdateEcnAccessPoint() {
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
            f -> f.withMarshaller(UpdateEcnAccessPointRequest::getEcnId, UpdateEcnAccessPointRequest::setEcnId));
        builder.<String>withRequestField("access_point_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEcnAccessPointRequest::getAccessPointId,
                UpdateEcnAccessPointRequest::setAccessPointId));
        builder.<UpdateAccessPointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateAccessPointRequestBody.class),
            f -> f.withMarshaller(UpdateEcnAccessPointRequest::getBody, UpdateEcnAccessPointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddEcnWithIegRequest, AddEcnWithIegResponse> addEcnWithIeg =
        genForAddEcnWithIeg();

    private static HttpRequestDef<AddEcnWithIegRequest, AddEcnWithIegResponse> genForAddEcnWithIeg() {
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
            f -> f.withMarshaller(AddEcnWithIegRequest::getEcnId, AddEcnWithIegRequest::setEcnId));
        builder.<EcnWithIegRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EcnWithIegRequest.class),
            f -> f.withMarshaller(AddEcnWithIegRequest::getBody, AddEcnWithIegRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEcnWithIegRequest, DeleteEcnWithIegResponse> deleteEcnWithIeg =
        genForDeleteEcnWithIeg();

    private static HttpRequestDef<DeleteEcnWithIegRequest, DeleteEcnWithIegResponse> genForDeleteEcnWithIeg() {
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
            f -> f.withMarshaller(DeleteEcnWithIegRequest::getEcnId, DeleteEcnWithIegRequest::setEcnId));
        builder.<String>withRequestField("relation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEcnWithIegRequest::getRelationId, DeleteEcnWithIegRequest::setRelationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEcnRequest, ListEcnResponse> listEcn = genForListEcn();

    private static HttpRequestDef<ListEcnRequest, ListEcnResponse> genForListEcn() {
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
            f -> f.withMarshaller(ListEcnRequest::getLimit, ListEcnRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEcnRequest::getMarker, ListEcnRequest::setMarker));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEcnRequest::getEnterpriseProjectId, ListEcnRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEcnWithIegRequest, ListEcnWithIegResponse> listEcnWithIeg =
        genForListEcnWithIeg();

    private static HttpRequestDef<ListEcnWithIegRequest, ListEcnWithIegResponse> genForListEcnWithIeg() {
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
            f -> f.withMarshaller(ListEcnWithIegRequest::getEcnId, ListEcnWithIegRequest::setEcnId));
        builder.<String>withRequestField("ieg_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEcnWithIegRequest::getIegId, ListEcnWithIegRequest::setIegId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEcnInfoRequest, ShowEcnInfoResponse> showEcnInfo = genForShowEcnInfo();

    private static HttpRequestDef<ShowEcnInfoRequest, ShowEcnInfoResponse> genForShowEcnInfo() {
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
            f -> f.withMarshaller(ShowEcnInfoRequest::getEcnId, ShowEcnInfoRequest::setEcnId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEcnWithIegRequest, ShowEcnWithIegResponse> showEcnWithIeg =
        genForShowEcnWithIeg();

    private static HttpRequestDef<ShowEcnWithIegRequest, ShowEcnWithIegResponse> genForShowEcnWithIeg() {
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
            f -> f.withMarshaller(ShowEcnWithIegRequest::getEcnId, ShowEcnWithIegRequest::setEcnId));
        builder.<String>withRequestField("relation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEcnWithIegRequest::getRelationId, ShowEcnWithIegRequest::setRelationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEcnRequest, UpdateEcnResponse> updateEcn = genForUpdateEcn();

    private static HttpRequestDef<UpdateEcnRequest, UpdateEcnResponse> genForUpdateEcn() {
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
            f -> f.withMarshaller(UpdateEcnRequest::getEcnId, UpdateEcnRequest::setEcnId));
        builder.<UpdateEcnRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateEcnRequestBody.class),
            f -> f.withMarshaller(UpdateEcnRequest::getBody, UpdateEcnRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEquipmentRequest, CreateEquipmentResponse> createEquipment =
        genForCreateEquipment();

    private static HttpRequestDef<CreateEquipmentRequest, CreateEquipmentResponse> genForCreateEquipment() {
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
            f -> f.withMarshaller(CreateEquipmentRequest::getIegId, CreateEquipmentRequest::setIegId));
        builder.<EquipmentActivate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EquipmentActivate.class),
            f -> f.withMarshaller(CreateEquipmentRequest::getBody, CreateEquipmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEquipmentRequest, DeleteEquipmentResponse> deleteEquipment =
        genForDeleteEquipment();

    private static HttpRequestDef<DeleteEquipmentRequest, DeleteEquipmentResponse> genForDeleteEquipment() {
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
            f -> f.withMarshaller(DeleteEquipmentRequest::getIegId, DeleteEquipmentRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEquipmentRequest::getEquipmentId, DeleteEquipmentRequest::setEquipmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GenerateInitialConfigurationRequest, GenerateInitialConfigurationResponse> generateInitialConfiguration =
        genForGenerateInitialConfiguration();

    private static HttpRequestDef<GenerateInitialConfigurationRequest, GenerateInitialConfigurationResponse> genForGenerateInitialConfiguration() {
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
            f -> f.withMarshaller(GenerateInitialConfigurationRequest::getIegId,
                GenerateInitialConfigurationRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GenerateInitialConfigurationRequest::getEquipmentId,
                GenerateInitialConfigurationRequest::setEquipmentId));
        builder.<InitialConfigurationReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InitialConfigurationReq.class),
            f -> f.withMarshaller(GenerateInitialConfigurationRequest::getBody,
                GenerateInitialConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEquipmentsRequest, ListEquipmentsResponse> listEquipments =
        genForListEquipments();

    private static HttpRequestDef<ListEquipmentsRequest, ListEquipmentsResponse> genForListEquipments() {
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
            f -> f.withMarshaller(ListEquipmentsRequest::getIegId, ListEquipmentsRequest::setIegId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RebootEquipmentRequest, RebootEquipmentResponse> rebootEquipment =
        genForRebootEquipment();

    private static HttpRequestDef<RebootEquipmentRequest, RebootEquipmentResponse> genForRebootEquipment() {
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
            f -> f.withMarshaller(RebootEquipmentRequest::getIegId, RebootEquipmentRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RebootEquipmentRequest::getEquipmentId, RebootEquipmentRequest::setEquipmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEquipmentInfoRequest, ShowEquipmentInfoResponse> showEquipmentInfo =
        genForShowEquipmentInfo();

    private static HttpRequestDef<ShowEquipmentInfoRequest, ShowEquipmentInfoResponse> genForShowEquipmentInfo() {
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
            f -> f.withMarshaller(ShowEquipmentInfoRequest::getIegId, ShowEquipmentInfoRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentInfoRequest::getEquipmentId, ShowEquipmentInfoRequest::setEquipmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEquipmentSpecificConfigRequest, ShowEquipmentSpecificConfigResponse> showEquipmentSpecificConfig =
        genForShowEquipmentSpecificConfig();

    private static HttpRequestDef<ShowEquipmentSpecificConfigRequest, ShowEquipmentSpecificConfigResponse> genForShowEquipmentSpecificConfig() {
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
            f -> f.withMarshaller(ShowEquipmentSpecificConfigRequest::getEquipmentId,
                ShowEquipmentSpecificConfigRequest::setEquipmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEquipmentEsnRequest, UpdateEquipmentEsnResponse> updateEquipmentEsn =
        genForUpdateEquipmentEsn();

    private static HttpRequestDef<UpdateEquipmentEsnRequest, UpdateEquipmentEsnResponse> genForUpdateEquipmentEsn() {
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
            f -> f.withMarshaller(UpdateEquipmentEsnRequest::getIegId, UpdateEquipmentEsnRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentEsnRequest::getEquipmentId,
                UpdateEquipmentEsnRequest::setEquipmentId));
        builder.<EquipmentEsn>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EquipmentEsn.class),
            f -> f.withMarshaller(UpdateEquipmentEsnRequest::getBody, UpdateEquipmentEsnRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEquipmentInfoRequest, UpdateEquipmentInfoResponse> updateEquipmentInfo =
        genForUpdateEquipmentInfo();

    private static HttpRequestDef<UpdateEquipmentInfoRequest, UpdateEquipmentInfoResponse> genForUpdateEquipmentInfo() {
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
            f -> f.withMarshaller(UpdateEquipmentInfoRequest::getIegId, UpdateEquipmentInfoRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentInfoRequest::getEquipmentId,
                UpdateEquipmentInfoRequest::setEquipmentId));
        builder.<UpdateEquipmentInfoBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEquipmentInfoBody.class),
            f -> f.withMarshaller(UpdateEquipmentInfoRequest::getBody, UpdateEquipmentInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEquipmentLanConfigRequest, CreateEquipmentLanConfigResponse> createEquipmentLanConfig =
        genForCreateEquipmentLanConfig();

    private static HttpRequestDef<CreateEquipmentLanConfigRequest, CreateEquipmentLanConfigResponse> genForCreateEquipmentLanConfig() {
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
            f -> f.withMarshaller(CreateEquipmentLanConfigRequest::getIegId,
                CreateEquipmentLanConfigRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEquipmentLanConfigRequest::getEquipmentId,
                CreateEquipmentLanConfigRequest::setEquipmentId));
        builder.<EquipmentLanItem>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EquipmentLanItem.class),
            f -> f.withMarshaller(CreateEquipmentLanConfigRequest::getBody, CreateEquipmentLanConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEquipmentLanConfigRequest, DeleteEquipmentLanConfigResponse> deleteEquipmentLanConfig =
        genForDeleteEquipmentLanConfig();

    private static HttpRequestDef<DeleteEquipmentLanConfigRequest, DeleteEquipmentLanConfigResponse> genForDeleteEquipmentLanConfig() {
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
            f -> f.withMarshaller(DeleteEquipmentLanConfigRequest::getIegId,
                DeleteEquipmentLanConfigRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEquipmentLanConfigRequest::getEquipmentId,
                DeleteEquipmentLanConfigRequest::setEquipmentId));
        builder.<String>withRequestField("interface_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEquipmentLanConfigRequest::getInterfaceName,
                DeleteEquipmentLanConfigRequest::setInterfaceName));
        builder.<String>withRequestField("vlan_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEquipmentLanConfigRequest::getVlanId,
                DeleteEquipmentLanConfigRequest::setVlanId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEquipmentInterfaceNameRequest, ListEquipmentInterfaceNameResponse> listEquipmentInterfaceName =
        genForListEquipmentInterfaceName();

    private static HttpRequestDef<ListEquipmentInterfaceNameRequest, ListEquipmentInterfaceNameResponse> genForListEquipmentInterfaceName() {
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
            f -> f.withMarshaller(ListEquipmentInterfaceNameRequest::getIegId,
                ListEquipmentInterfaceNameRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEquipmentInterfaceNameRequest::getEquipmentId,
                ListEquipmentInterfaceNameRequest::setEquipmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEquipmentDnsInfoRequest, ShowEquipmentDnsInfoResponse> showEquipmentDnsInfo =
        genForShowEquipmentDnsInfo();

    private static HttpRequestDef<ShowEquipmentDnsInfoRequest, ShowEquipmentDnsInfoResponse> genForShowEquipmentDnsInfo() {
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
            f -> f.withMarshaller(ShowEquipmentDnsInfoRequest::getIegId, ShowEquipmentDnsInfoRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentDnsInfoRequest::getEquipmentId,
                ShowEquipmentDnsInfoRequest::setEquipmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEquipmentLanInfoRequest, ShowEquipmentLanInfoResponse> showEquipmentLanInfo =
        genForShowEquipmentLanInfo();

    private static HttpRequestDef<ShowEquipmentLanInfoRequest, ShowEquipmentLanInfoResponse> genForShowEquipmentLanInfo() {
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
            f -> f.withMarshaller(ShowEquipmentLanInfoRequest::getIegId, ShowEquipmentLanInfoRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentLanInfoRequest::getEquipmentId,
                ShowEquipmentLanInfoRequest::setEquipmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEquipmentDnsInfoRequest, UpdateEquipmentDnsInfoResponse> updateEquipmentDnsInfo =
        genForUpdateEquipmentDnsInfo();

    private static HttpRequestDef<UpdateEquipmentDnsInfoRequest, UpdateEquipmentDnsInfoResponse> genForUpdateEquipmentDnsInfo() {
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
            f -> f.withMarshaller(UpdateEquipmentDnsInfoRequest::getIegId, UpdateEquipmentDnsInfoRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentDnsInfoRequest::getEquipmentId,
                UpdateEquipmentDnsInfoRequest::setEquipmentId));
        builder.<EquipmentDnsItem>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EquipmentDnsItem.class),
            f -> f.withMarshaller(UpdateEquipmentDnsInfoRequest::getBody, UpdateEquipmentDnsInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEquipmentLanConfigRequest, UpdateEquipmentLanConfigResponse> updateEquipmentLanConfig =
        genForUpdateEquipmentLanConfig();

    private static HttpRequestDef<UpdateEquipmentLanConfigRequest, UpdateEquipmentLanConfigResponse> genForUpdateEquipmentLanConfig() {
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
            f -> f.withMarshaller(UpdateEquipmentLanConfigRequest::getIegId,
                UpdateEquipmentLanConfigRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentLanConfigRequest::getEquipmentId,
                UpdateEquipmentLanConfigRequest::setEquipmentId));
        builder.<EquipmentLanItem>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EquipmentLanItem.class),
            f -> f.withMarshaller(UpdateEquipmentLanConfigRequest::getBody, UpdateEquipmentLanConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEquipmentOspfRequest, ShowEquipmentOspfResponse> showEquipmentOspf =
        genForShowEquipmentOspf();

    private static HttpRequestDef<ShowEquipmentOspfRequest, ShowEquipmentOspfResponse> genForShowEquipmentOspf() {
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
            f -> f.withMarshaller(ShowEquipmentOspfRequest::getIegId, ShowEquipmentOspfRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentOspfRequest::getEquipmentId, ShowEquipmentOspfRequest::setEquipmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEquipmentOspfRequest, UpdateEquipmentOspfResponse> updateEquipmentOspf =
        genForUpdateEquipmentOspf();

    private static HttpRequestDef<UpdateEquipmentOspfRequest, UpdateEquipmentOspfResponse> genForUpdateEquipmentOspf() {
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
            f -> f.withMarshaller(UpdateEquipmentOspfRequest::getIegId, UpdateEquipmentOspfRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentOspfRequest::getEquipmentId,
                UpdateEquipmentOspfRequest::setEquipmentId));
        builder.<EquipmentOspfItem>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EquipmentOspfItem.class),
            f -> f.withMarshaller(UpdateEquipmentOspfRequest::getBody, UpdateEquipmentOspfRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEquipmentStaticRouteConfigRequest, CreateEquipmentStaticRouteConfigResponse> createEquipmentStaticRouteConfig =
        genForCreateEquipmentStaticRouteConfig();

    private static HttpRequestDef<CreateEquipmentStaticRouteConfigRequest, CreateEquipmentStaticRouteConfigResponse> genForCreateEquipmentStaticRouteConfig() {
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
            f -> f.withMarshaller(CreateEquipmentStaticRouteConfigRequest::getIegId,
                CreateEquipmentStaticRouteConfigRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEquipmentStaticRouteConfigRequest::getEquipmentId,
                CreateEquipmentStaticRouteConfigRequest::setEquipmentId));
        builder.<StaticRouteItem>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StaticRouteItem.class),
            f -> f.withMarshaller(CreateEquipmentStaticRouteConfigRequest::getBody,
                CreateEquipmentStaticRouteConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEquipmentStaticRouteConfigRequest, DeleteEquipmentStaticRouteConfigResponse> deleteEquipmentStaticRouteConfig =
        genForDeleteEquipmentStaticRouteConfig();

    private static HttpRequestDef<DeleteEquipmentStaticRouteConfigRequest, DeleteEquipmentStaticRouteConfigResponse> genForDeleteEquipmentStaticRouteConfig() {
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
            f -> f.withMarshaller(DeleteEquipmentStaticRouteConfigRequest::getIegId,
                DeleteEquipmentStaticRouteConfigRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEquipmentStaticRouteConfigRequest::getEquipmentId,
                DeleteEquipmentStaticRouteConfigRequest::setEquipmentId));
        builder.<String>withRequestField("prefix",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEquipmentStaticRouteConfigRequest::getPrefix,
                DeleteEquipmentStaticRouteConfigRequest::setPrefix));
        builder.<String>withRequestField("next_hop",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEquipmentStaticRouteConfigRequest::getNextHop,
                DeleteEquipmentStaticRouteConfigRequest::setNextHop));
        builder.<String>withRequestField("interface_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEquipmentStaticRouteConfigRequest::getInterfaceName,
                DeleteEquipmentStaticRouteConfigRequest::setInterfaceName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEquipmentStaticRouteInfoRequest, ShowEquipmentStaticRouteInfoResponse> showEquipmentStaticRouteInfo =
        genForShowEquipmentStaticRouteInfo();

    private static HttpRequestDef<ShowEquipmentStaticRouteInfoRequest, ShowEquipmentStaticRouteInfoResponse> genForShowEquipmentStaticRouteInfo() {
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
            f -> f.withMarshaller(ShowEquipmentStaticRouteInfoRequest::getIegId,
                ShowEquipmentStaticRouteInfoRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentStaticRouteInfoRequest::getEquipmentId,
                ShowEquipmentStaticRouteInfoRequest::setEquipmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEquipmentStaticRouteConfigRequest, UpdateEquipmentStaticRouteConfigResponse> updateEquipmentStaticRouteConfig =
        genForUpdateEquipmentStaticRouteConfig();

    private static HttpRequestDef<UpdateEquipmentStaticRouteConfigRequest, UpdateEquipmentStaticRouteConfigResponse> genForUpdateEquipmentStaticRouteConfig() {
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
            f -> f.withMarshaller(UpdateEquipmentStaticRouteConfigRequest::getIegId,
                UpdateEquipmentStaticRouteConfigRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentStaticRouteConfigRequest::getEquipmentId,
                UpdateEquipmentStaticRouteConfigRequest::setEquipmentId));
        builder.<StaticRouteItem>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StaticRouteItem.class),
            f -> f.withMarshaller(UpdateEquipmentStaticRouteConfigRequest::getBody,
                UpdateEquipmentStaticRouteConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEquipmentWanInfoRequest, ShowEquipmentWanInfoResponse> showEquipmentWanInfo =
        genForShowEquipmentWanInfo();

    private static HttpRequestDef<ShowEquipmentWanInfoRequest, ShowEquipmentWanInfoResponse> genForShowEquipmentWanInfo() {
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
            f -> f.withMarshaller(ShowEquipmentWanInfoRequest::getIegId, ShowEquipmentWanInfoRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentWanInfoRequest::getEquipmentId,
                ShowEquipmentWanInfoRequest::setEquipmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEquipmentWanConfigRequest, UpdateEquipmentWanConfigResponse> updateEquipmentWanConfig =
        genForUpdateEquipmentWanConfig();

    private static HttpRequestDef<UpdateEquipmentWanConfigRequest, UpdateEquipmentWanConfigResponse> genForUpdateEquipmentWanConfig() {
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
            f -> f.withMarshaller(UpdateEquipmentWanConfigRequest::getIegId,
                UpdateEquipmentWanConfigRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentWanConfigRequest::getEquipmentId,
                UpdateEquipmentWanConfigRequest::setEquipmentId));
        builder.<EquipmentWanItemList>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EquipmentWanItemList.class),
            f -> f.withMarshaller(UpdateEquipmentWanConfigRequest::getBody, UpdateEquipmentWanConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEquipmentWlanRequest, ShowEquipmentWlanResponse> showEquipmentWlan =
        genForShowEquipmentWlan();

    private static HttpRequestDef<ShowEquipmentWlanRequest, ShowEquipmentWlanResponse> genForShowEquipmentWlan() {
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
            f -> f.withMarshaller(ShowEquipmentWlanRequest::getIegId, ShowEquipmentWlanRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEquipmentWlanRequest::getEquipmentId, ShowEquipmentWlanRequest::setEquipmentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEquipmentWlanRequest, UpdateEquipmentWlanResponse> updateEquipmentWlan =
        genForUpdateEquipmentWlan();

    private static HttpRequestDef<UpdateEquipmentWlanRequest, UpdateEquipmentWlanResponse> genForUpdateEquipmentWlan() {
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
            f -> f.withMarshaller(UpdateEquipmentWlanRequest::getIegId, UpdateEquipmentWlanRequest::setIegId));
        builder.<String>withRequestField("equipment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEquipmentWlanRequest::getEquipmentId,
                UpdateEquipmentWlanRequest::setEquipmentId));
        builder.<EquipmentWlanItem>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EquipmentWlanItem.class),
            f -> f.withMarshaller(UpdateEquipmentWlanRequest::getBody, UpdateEquipmentWlanRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddEcnWithErRequest, AddEcnWithErResponse> addEcnWithEr = genForAddEcnWithEr();

    private static HttpRequestDef<AddEcnWithErRequest, AddEcnWithErResponse> genForAddEcnWithEr() {
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
            f -> f.withMarshaller(AddEcnWithErRequest::getEcnId, AddEcnWithErRequest::setEcnId));
        builder.<EcnWithErRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EcnWithErRequest.class),
            f -> f.withMarshaller(AddEcnWithErRequest::getBody, AddEcnWithErRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEcnWithErRequest, DeleteEcnWithErResponse> deleteEcnWithEr =
        genForDeleteEcnWithEr();

    private static HttpRequestDef<DeleteEcnWithErRequest, DeleteEcnWithErResponse> genForDeleteEcnWithEr() {
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
            f -> f.withMarshaller(DeleteEcnWithErRequest::getEcnId, DeleteEcnWithErRequest::setEcnId));
        builder.<String>withRequestField("relation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEcnWithErRequest::getRelationId, DeleteEcnWithErRequest::setRelationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEcnWithErRequest, ListEcnWithErResponse> listEcnWithEr =
        genForListEcnWithEr();

    private static HttpRequestDef<ListEcnWithErRequest, ListEcnWithErResponse> genForListEcnWithEr() {
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
            f -> f.withMarshaller(ListEcnWithErRequest::getEcnId, ListEcnWithErRequest::setEcnId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeIegPasswordRequest, ChangeIegPasswordResponse> changeIegPassword =
        genForChangeIegPassword();

    private static HttpRequestDef<ChangeIegPasswordRequest, ChangeIegPasswordResponse> genForChangeIegPassword() {
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
            f -> f.withMarshaller(ChangeIegPasswordRequest::getIegId, ChangeIegPasswordRequest::setIegId));
        builder.<ChangePasswordBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangePasswordBody.class),
            f -> f.withMarshaller(ChangeIegPasswordRequest::getBody, ChangeIegPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIegRequest, ListIegResponse> listIeg = genForListIeg();

    private static HttpRequestDef<ListIegRequest, ListIegResponse> genForListIeg() {
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
            f -> f.withMarshaller(ListIegRequest::getLimit, ListIegRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIegRequest::getMarker, ListIegRequest::setMarker));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListIegRequest::getEnterpriseProjectId, ListIegRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIegInfoRequest, ShowIegInfoResponse> showIegInfo = genForShowIegInfo();

    private static HttpRequestDef<ShowIegInfoRequest, ShowIegInfoResponse> genForShowIegInfo() {
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
            f -> f.withMarshaller(ShowIegInfoRequest::getIegId, ShowIegInfoRequest::setIegId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchEquipmentHaTypeRequest, SwitchEquipmentHaTypeResponse> switchEquipmentHaType =
        genForSwitchEquipmentHaType();

    private static HttpRequestDef<SwitchEquipmentHaTypeRequest, SwitchEquipmentHaTypeResponse> genForSwitchEquipmentHaType() {
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
            f -> f.withMarshaller(SwitchEquipmentHaTypeRequest::getIegId, SwitchEquipmentHaTypeRequest::setIegId));
        builder.<SwitchHaTypeBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchHaTypeBody.class),
            f -> f.withMarshaller(SwitchEquipmentHaTypeRequest::getBody, SwitchEquipmentHaTypeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIegRequest, UpdateIegResponse> updateIeg = genForUpdateIeg();

    private static HttpRequestDef<UpdateIegRequest, UpdateIegResponse> genForUpdateIeg() {
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
            f -> f.withMarshaller(UpdateIegRequest::getIegId, UpdateIegRequest::setIegId));
        builder.<UpdateIegRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateIegRequestBody.class),
            f -> f.withMarshaller(UpdateIegRequest::getBody, UpdateIegRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasInfoRequest, ShowQuotasInfoResponse> showQuotasInfo =
        genForShowQuotasInfo();

    private static HttpRequestDef<ShowQuotasInfoRequest, ShowQuotasInfoResponse> genForShowQuotasInfo() {
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

    public static final HttpRequestDef<AddEcnWithVpcRequest, AddEcnWithVpcResponse> addEcnWithVpc =
        genForAddEcnWithVpc();

    private static HttpRequestDef<AddEcnWithVpcRequest, AddEcnWithVpcResponse> genForAddEcnWithVpc() {
        // basic
        HttpRequestDef.Builder<AddEcnWithVpcRequest, AddEcnWithVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddEcnWithVpcRequest.class, AddEcnWithVpcResponse.class)
                .withName("AddEcnWithVpc")
                .withUri("/v1/{domain_id}/enterprise-connect/enterprise-connect-network/{ecn_id}/relationship/vpc")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ecn_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddEcnWithVpcRequest::getEcnId, AddEcnWithVpcRequest::setEcnId));
        builder.<AddEcnWithVpcRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddEcnWithVpcRequestBody.class),
            f -> f.withMarshaller(AddEcnWithVpcRequest::getBody, AddEcnWithVpcRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEcnWithVpcRequest, DeleteEcnWithVpcResponse> deleteEcnWithVpc =
        genForDeleteEcnWithVpc();

    private static HttpRequestDef<DeleteEcnWithVpcRequest, DeleteEcnWithVpcResponse> genForDeleteEcnWithVpc() {
        // basic
        HttpRequestDef.Builder<DeleteEcnWithVpcRequest, DeleteEcnWithVpcResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEcnWithVpcRequest.class, DeleteEcnWithVpcResponse.class)
            .withName("DeleteEcnWithVpc")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/enterprise-connect-network/{ecn_id}/relationship/vpc/{relation_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ecn_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEcnWithVpcRequest::getEcnId, DeleteEcnWithVpcRequest::setEcnId));
        builder.<String>withRequestField("relation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEcnWithVpcRequest::getRelationId, DeleteEcnWithVpcRequest::setRelationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEcnWithVpcRequest, ListEcnWithVpcResponse> listEcnWithVpc =
        genForListEcnWithVpc();

    private static HttpRequestDef<ListEcnWithVpcRequest, ListEcnWithVpcResponse> genForListEcnWithVpc() {
        // basic
        HttpRequestDef.Builder<ListEcnWithVpcRequest, ListEcnWithVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEcnWithVpcRequest.class, ListEcnWithVpcResponse.class)
                .withName("ListEcnWithVpc")
                .withUri("/v1/{domain_id}/enterprise-connect/enterprise-connect-network/{ecn_id}/relationship/vpc")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ecn_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEcnWithVpcRequest::getEcnId, ListEcnWithVpcRequest::setEcnId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEcnWithVpcRequest, UpdateEcnWithVpcResponse> updateEcnWithVpc =
        genForUpdateEcnWithVpc();

    private static HttpRequestDef<UpdateEcnWithVpcRequest, UpdateEcnWithVpcResponse> genForUpdateEcnWithVpc() {
        // basic
        HttpRequestDef.Builder<UpdateEcnWithVpcRequest, UpdateEcnWithVpcResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateEcnWithVpcRequest.class, UpdateEcnWithVpcResponse.class)
            .withName("UpdateEcnWithVpc")
            .withUri(
                "/v1/{domain_id}/enterprise-connect/enterprise-connect-network/{ecn_id}/relationship/vpc/{relation_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ecn_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEcnWithVpcRequest::getEcnId, UpdateEcnWithVpcRequest::setEcnId));
        builder.<String>withRequestField("relation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEcnWithVpcRequest::getRelationId, UpdateEcnWithVpcRequest::setRelationId));
        builder.<UpdateEcnWithVpcRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateEcnWithVpcRequestBody.class),
            f -> f.withMarshaller(UpdateEcnWithVpcRequest::getBody, UpdateEcnWithVpcRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddVrrpConfigRequest, AddVrrpConfigResponse> addVrrpConfig =
        genForAddVrrpConfig();

    private static HttpRequestDef<AddVrrpConfigRequest, AddVrrpConfigResponse> genForAddVrrpConfig() {
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
            f -> f.withMarshaller(AddVrrpConfigRequest::getIegId, AddVrrpConfigRequest::setIegId));
        builder.<CreateUpdateVrrpConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateUpdateVrrpConfigRequestBody.class),
            f -> f.withMarshaller(AddVrrpConfigRequest::getBody, AddVrrpConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVrrpConfigRequest, DeleteVrrpConfigResponse> deleteVrrpConfig =
        genForDeleteVrrpConfig();

    private static HttpRequestDef<DeleteVrrpConfigRequest, DeleteVrrpConfigResponse> genForDeleteVrrpConfig() {
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
            f -> f.withMarshaller(DeleteVrrpConfigRequest::getIegId, DeleteVrrpConfigRequest::setIegId));
        builder.<Integer>withRequestField("virtual_router_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteVrrpConfigRequest::getVirtualRouterId,
                DeleteVrrpConfigRequest::setVirtualRouterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVrrpConfigRequest, ShowVrrpConfigResponse> showVrrpConfig =
        genForShowVrrpConfig();

    private static HttpRequestDef<ShowVrrpConfigRequest, ShowVrrpConfigResponse> genForShowVrrpConfig() {
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
            f -> f.withMarshaller(ShowVrrpConfigRequest::getIegId, ShowVrrpConfigRequest::setIegId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVrrpConfigRequest, UpdateVrrpConfigResponse> updateVrrpConfig =
        genForUpdateVrrpConfig();

    private static HttpRequestDef<UpdateVrrpConfigRequest, UpdateVrrpConfigResponse> genForUpdateVrrpConfig() {
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
            f -> f.withMarshaller(UpdateVrrpConfigRequest::getIegId, UpdateVrrpConfigRequest::setIegId));
        builder.<Integer>withRequestField("virtual_router_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateVrrpConfigRequest::getVirtualRouterId,
                UpdateVrrpConfigRequest::setVirtualRouterId));
        builder.<CreateUpdateVrrpConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateUpdateVrrpConfigRequestBody.class),
            f -> f.withMarshaller(UpdateVrrpConfigRequest::getBody, UpdateVrrpConfigRequest::setBody));

        // response

        return builder.build();
    }

}
