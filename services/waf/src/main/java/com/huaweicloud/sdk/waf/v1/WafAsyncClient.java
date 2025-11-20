package com.huaweicloud.sdk.waf.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.waf.v1.model.ApplyCertificateToHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ApplyCertificateToHostResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateAntiTamperRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateAntiTamperRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateAntileakageRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateAntileakageRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateCcRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateCcRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateCustomRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateCustomRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateGeoIpRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateGeoIpRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateIpReputationRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateIpReputationRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchCreatePrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchCreatePrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateWhiteblackipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchCreateWhiteblackipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchDeleteAlertNoticeConfigRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchDeleteAlertNoticeConfigResponse;
import com.huaweicloud.sdk.waf.v1.model.BatchDeletePoliciesRequest;
import com.huaweicloud.sdk.waf.v1.model.BatchDeletePoliciesResponse;
import com.huaweicloud.sdk.waf.v1.model.ChangePrepaidCloudWafRequest;
import com.huaweicloud.sdk.waf.v1.model.ChangePrepaidCloudWafResponse;
import com.huaweicloud.sdk.waf.v1.model.CheckAgencyRequest;
import com.huaweicloud.sdk.waf.v1.model.CheckAgencyResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmApplicationTypesRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmApplicationTypesResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmAsyncJobRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmAsyncJobResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmIpReputationRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmIpReputationRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmPolicyAntileakageMapRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmPolicyAntileakageMapResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmPolicyIpReputationMapRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmPolicyIpReputationMapResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmProtectionTypesRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmProtectionTypesResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmThreatMapRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmThreatMapResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmTmsResourceInstancesRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmTmsResourceInstancesResponse;
import com.huaweicloud.sdk.waf.v1.model.ConfirmUserBundleRequest;
import com.huaweicloud.sdk.waf.v1.model.ConfirmUserBundleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateAgencyRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateAgencyResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateAlertNoticeConfigRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateAlertNoticeConfigResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateAntiTamperRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateAntiTamperRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateAnticrawlerRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateAnticrawlerRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateAntileakageRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateAntileakageRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateCcRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateCcRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateCertificateRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateCertificateResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateCloudWafPostPaidResourceRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateCloudWafPostPaidResourceResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateCustomRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateCustomRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateGeoipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateGeoipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateHostRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateHostResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateIpGroupRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateIpGroupResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateIpReputationRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateIpReputationRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreatePolicyRequest;
import com.huaweicloud.sdk.waf.v1.model.CreatePolicyResponse;
import com.huaweicloud.sdk.waf.v1.model.CreatePremiumHostRequest;
import com.huaweicloud.sdk.waf.v1.model.CreatePremiumHostResponse;
import com.huaweicloud.sdk.waf.v1.model.CreatePrepaidCloudWafRequest;
import com.huaweicloud.sdk.waf.v1.model.CreatePrepaidCloudWafResponse;
import com.huaweicloud.sdk.waf.v1.model.CreatePrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreatePrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreatePunishmentRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreatePunishmentRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateQuickAccessDomainRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateQuickAccessDomainResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateValueListRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateValueListResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateWhiteblackipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateWhiteblackipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteAgencyRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteAgencyResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteAnticrawlerRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteAnticrawlerRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteAntileakageRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteAntileakageRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteAntitamperRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteAntitamperRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteCcRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteCcRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteCertificateRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteCertificateResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteCloudWafPostPaidResourceRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteCloudWafPostPaidResourceResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteCustomRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteCustomRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteGeoipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteGeoipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteHostRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteHostResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteIpGroupRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteIpGroupResponse;
import com.huaweicloud.sdk.waf.v1.model.DeletePolicyRequest;
import com.huaweicloud.sdk.waf.v1.model.DeletePolicyResponse;
import com.huaweicloud.sdk.waf.v1.model.DeletePremiumHostRequest;
import com.huaweicloud.sdk.waf.v1.model.DeletePremiumHostResponse;
import com.huaweicloud.sdk.waf.v1.model.DeletePrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeletePrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeletePunishmentRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeletePunishmentRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteValueListRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteValueListResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteWhiteBlackIpRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteWhiteBlackIpRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ListAntiTamperPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListAntiTamperPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListAnticrawlerRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListAnticrawlerRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListAntileakagePolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListAntileakagePolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListAntileakageRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListAntileakageRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListAntitamperRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ListAntitamperRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ListAttackActionTypesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListAttackActionTypesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListBandwidthTimelineRequest;
import com.huaweicloud.sdk.waf.v1.model.ListBandwidthTimelineResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCcPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCcPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCcRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCcRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCertificatesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCertificatesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCompositeHostsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCompositeHostsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCustomPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCustomPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCustomRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCustomRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListEventLogRequest;
import com.huaweicloud.sdk.waf.v1.model.ListEventLogResponse;
import com.huaweicloud.sdk.waf.v1.model.ListEventRequest;
import com.huaweicloud.sdk.waf.v1.model.ListEventResponse;
import com.huaweicloud.sdk.waf.v1.model.ListGeoIpPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListGeoIpPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListGeoipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ListGeoipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ListHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ListHostResponse;
import com.huaweicloud.sdk.waf.v1.model.ListHostRouteRequest;
import com.huaweicloud.sdk.waf.v1.model.ListHostRouteResponse;
import com.huaweicloud.sdk.waf.v1.model.ListIgnorePolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListIgnorePolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ListIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ListInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.ListInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListIpGroupRequest;
import com.huaweicloud.sdk.waf.v1.model.ListIpGroupResponse;
import com.huaweicloud.sdk.waf.v1.model.ListIpReputationPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListIpReputationPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListIpReputationRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListIpReputationRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListNoticeConfigsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListNoticeConfigsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListOverviewsClassificationRequest;
import com.huaweicloud.sdk.waf.v1.model.ListOverviewsClassificationResponse;
import com.huaweicloud.sdk.waf.v1.model.ListPolicyRequest;
import com.huaweicloud.sdk.waf.v1.model.ListPolicyResponse;
import com.huaweicloud.sdk.waf.v1.model.ListPremiumHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ListPremiumHostResponse;
import com.huaweicloud.sdk.waf.v1.model.ListPrivacyPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListPrivacyPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListPrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ListPrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ListProtectableResourcesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListProtectableResourcesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListPunishmentRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListPunishmentRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListQpsTimelineRequest;
import com.huaweicloud.sdk.waf.v1.model.ListQpsTimelineResponse;
import com.huaweicloud.sdk.waf.v1.model.ListRequestTimelineRequest;
import com.huaweicloud.sdk.waf.v1.model.ListRequestTimelineResponse;
import com.huaweicloud.sdk.waf.v1.model.ListResponseCodeTimelineRequest;
import com.huaweicloud.sdk.waf.v1.model.ListResponseCodeTimelineResponse;
import com.huaweicloud.sdk.waf.v1.model.ListSecurityReportHistoryPeriodsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListSecurityReportHistoryPeriodsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListSecurityReportSendingRecordsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListSecurityReportSendingRecordsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListSecurityReportSubscriptionsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListSecurityReportSubscriptionsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListStatisticsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListStatisticsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListTopAbnormalRequest;
import com.huaweicloud.sdk.waf.v1.model.ListTopAbnormalResponse;
import com.huaweicloud.sdk.waf.v1.model.ListTopDomainsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListTopDomainsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListTopIpRequest;
import com.huaweicloud.sdk.waf.v1.model.ListTopIpResponse;
import com.huaweicloud.sdk.waf.v1.model.ListTopUrlRequest;
import com.huaweicloud.sdk.waf.v1.model.ListTopUrlResponse;
import com.huaweicloud.sdk.waf.v1.model.ListValueListRequest;
import com.huaweicloud.sdk.waf.v1.model.ListValueListResponse;
import com.huaweicloud.sdk.waf.v1.model.ListWebBasicProtectionRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListWebBasicProtectionRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListWhiteblackipPolicyRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListWhiteblackipPolicyRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListWhiteblackipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ListWhiteblackipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.MigrateCompositeHostsRequest;
import com.huaweicloud.sdk.waf.v1.model.MigrateCompositeHostsResponse;
import com.huaweicloud.sdk.waf.v1.model.RenameInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.RenameInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowAnticrawlerRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowAnticrawlerRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowAntileakageRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowAntileakageRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowAntitamperRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowAntitamperRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowCcRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowCcRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowCertificateRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowCertificateResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowCompositeHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowCompositeHostResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowConsoleConfigRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowConsoleConfigResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowCustomRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowCustomRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowEventRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowEventResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowGeoipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowGeoipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowHostResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowHostStatusRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowHostStatusResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowIpGroupRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowIpGroupResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowLtsInfoConfigRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowLtsInfoConfigResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowPolicyGeoipMapRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowPolicyGeoipMapResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowPolicyRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowPolicyResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowPremiumHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowPremiumHostResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowPrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowPrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowPunishmentRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowPunishmentRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowSecurityReportContentRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowSecurityReportContentResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowSecurityReportSubscriptionRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowSecurityReportSubscriptionResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowSourceIpRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowSourceIpResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowSubscriptionInfoRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowSubscriptionInfoResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowValueListRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowValueListResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowWebProtectionRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowWebProtectionRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowWhiteBlackIpRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowWhiteBlackIpRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateAccessProgressRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAccessProgressResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateAlertNoticeConfigRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAlertNoticeConfigResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateAntiTamperRuleRefreshRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAntiTamperRuleRefreshResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateAnticrawlerRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAnticrawlerRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateAnticrawlerRuleTypeRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAnticrawlerRuleTypeResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateAntileakageRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAntileakageRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateCcRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateCcRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateCertificateRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateCertificateResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateCustomRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateCustomRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateGeoipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateGeoipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostAccessStatusOfUnderlineRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostAccessStatusOfUnderlineResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostProtectStatusRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostProtectStatusResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateInstanceRouteRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateInstanceRouteResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateIpGroupRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateIpGroupResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateIpReputationRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateIpReputationRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateLtsInfoConfigRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateLtsInfoConfigResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyProtectHostRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyProtectHostResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyRuleStatusRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyRuleStatusResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostAccessStatusRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostAccessStatusResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostProtectStatusRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostProtectStatusResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePunishmentRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePunishmentRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateValueListRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateValueListResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateWhiteblackipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateWhiteblackipRuleResponse;

import java.util.concurrent.CompletableFuture;

public class WafAsyncClient {

    protected HcClient hcClient;

    public WafAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<WafAsyncClient> newBuilder() {
        ClientBuilder<WafAsyncClient> clientBuilder = new ClientBuilder<>(WafAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 绑定证书到域名
     *
     * 绑定证书到域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyCertificateToHostRequest 请求对象
     * @return CompletableFuture<ApplyCertificateToHostResponse>
     */
    public CompletableFuture<ApplyCertificateToHostResponse> applyCertificateToHostAsync(
        ApplyCertificateToHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.applyCertificateToHost);
    }

    /**
     * 绑定证书到域名
     *
     * 绑定证书到域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyCertificateToHostRequest 请求对象
     * @return AsyncInvoker<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse>
     */
    public AsyncInvoker<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse> applyCertificateToHostAsyncInvoker(
        ApplyCertificateToHostRequest request) {
        return new AsyncInvoker<>(request, WafMeta.applyCertificateToHost, hcClient);
    }

    /**
     * 选中多个策略批量添加网页防篡改规则
     *
     * 选中多个策略为这些策略批量添加网页防篡改规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateAntiTamperRuleRequest 请求对象
     * @return CompletableFuture<BatchCreateAntiTamperRuleResponse>
     */
    public CompletableFuture<BatchCreateAntiTamperRuleResponse> batchCreateAntiTamperRuleAsync(
        BatchCreateAntiTamperRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.batchCreateAntiTamperRule);
    }

    /**
     * 选中多个策略批量添加网页防篡改规则
     *
     * 选中多个策略为这些策略批量添加网页防篡改规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateAntiTamperRuleRequest 请求对象
     * @return AsyncInvoker<BatchCreateAntiTamperRuleRequest, BatchCreateAntiTamperRuleResponse>
     */
    public AsyncInvoker<BatchCreateAntiTamperRuleRequest, BatchCreateAntiTamperRuleResponse> batchCreateAntiTamperRuleAsyncInvoker(
        BatchCreateAntiTamperRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.batchCreateAntiTamperRule, hcClient);
    }

    /**
     * 选中多个策略批量添加防敏感信息泄漏规则
     *
     * 选中多个策略为这些策略批量添加防敏感信息泄漏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateAntileakageRuleRequest 请求对象
     * @return CompletableFuture<BatchCreateAntileakageRuleResponse>
     */
    public CompletableFuture<BatchCreateAntileakageRuleResponse> batchCreateAntileakageRuleAsync(
        BatchCreateAntileakageRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.batchCreateAntileakageRule);
    }

    /**
     * 选中多个策略批量添加防敏感信息泄漏规则
     *
     * 选中多个策略为这些策略批量添加防敏感信息泄漏规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateAntileakageRuleRequest 请求对象
     * @return AsyncInvoker<BatchCreateAntileakageRuleRequest, BatchCreateAntileakageRuleResponse>
     */
    public AsyncInvoker<BatchCreateAntileakageRuleRequest, BatchCreateAntileakageRuleResponse> batchCreateAntileakageRuleAsyncInvoker(
        BatchCreateAntileakageRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.batchCreateAntileakageRule, hcClient);
    }

    /**
     * 选中多个策略为批量添加cc规则
     *
     * 选中多个策略为这些策略批量添加cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateCcRuleRequest 请求对象
     * @return CompletableFuture<BatchCreateCcRuleResponse>
     */
    public CompletableFuture<BatchCreateCcRuleResponse> batchCreateCcRuleAsync(BatchCreateCcRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.batchCreateCcRule);
    }

    /**
     * 选中多个策略为批量添加cc规则
     *
     * 选中多个策略为这些策略批量添加cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateCcRuleRequest 请求对象
     * @return AsyncInvoker<BatchCreateCcRuleRequest, BatchCreateCcRuleResponse>
     */
    public AsyncInvoker<BatchCreateCcRuleRequest, BatchCreateCcRuleResponse> batchCreateCcRuleAsyncInvoker(
        BatchCreateCcRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.batchCreateCcRule, hcClient);
    }

    /**
     * 选中多个策略批量添加精准防护规则
     *
     * 选中多个策略为这些策略批量添加精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateCustomRuleRequest 请求对象
     * @return CompletableFuture<BatchCreateCustomRuleResponse>
     */
    public CompletableFuture<BatchCreateCustomRuleResponse> batchCreateCustomRuleAsync(
        BatchCreateCustomRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.batchCreateCustomRule);
    }

    /**
     * 选中多个策略批量添加精准防护规则
     *
     * 选中多个策略为这些策略批量添加精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateCustomRuleRequest 请求对象
     * @return AsyncInvoker<BatchCreateCustomRuleRequest, BatchCreateCustomRuleResponse>
     */
    public AsyncInvoker<BatchCreateCustomRuleRequest, BatchCreateCustomRuleResponse> batchCreateCustomRuleAsyncInvoker(
        BatchCreateCustomRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.batchCreateCustomRule, hcClient);
    }

    /**
     * 选中多个策略批量添加地理位置访问控制规则
     *
     * 选中多个策略为这些策略批量添加地理位置访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateGeoIpRuleRequest 请求对象
     * @return CompletableFuture<BatchCreateGeoIpRuleResponse>
     */
    public CompletableFuture<BatchCreateGeoIpRuleResponse> batchCreateGeoIpRuleAsync(
        BatchCreateGeoIpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.batchCreateGeoIpRule);
    }

    /**
     * 选中多个策略批量添加地理位置访问控制规则
     *
     * 选中多个策略为这些策略批量添加地理位置访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateGeoIpRuleRequest 请求对象
     * @return AsyncInvoker<BatchCreateGeoIpRuleRequest, BatchCreateGeoIpRuleResponse>
     */
    public AsyncInvoker<BatchCreateGeoIpRuleRequest, BatchCreateGeoIpRuleResponse> batchCreateGeoIpRuleAsyncInvoker(
        BatchCreateGeoIpRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.batchCreateGeoIpRule, hcClient);
    }

    /**
     * 选中多个策略批量添加全局白名单规则
     *
     * 选中多个策略为这些策略批量添加全局白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateIgnoreRuleRequest 请求对象
     * @return CompletableFuture<BatchCreateIgnoreRuleResponse>
     */
    public CompletableFuture<BatchCreateIgnoreRuleResponse> batchCreateIgnoreRuleAsync(
        BatchCreateIgnoreRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.batchCreateIgnoreRule);
    }

    /**
     * 选中多个策略批量添加全局白名单规则
     *
     * 选中多个策略为这些策略批量添加全局白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateIgnoreRuleRequest 请求对象
     * @return AsyncInvoker<BatchCreateIgnoreRuleRequest, BatchCreateIgnoreRuleResponse>
     */
    public AsyncInvoker<BatchCreateIgnoreRuleRequest, BatchCreateIgnoreRuleResponse> batchCreateIgnoreRuleAsyncInvoker(
        BatchCreateIgnoreRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.batchCreateIgnoreRule, hcClient);
    }

    /**
     * 为多个策略批量添加威胁情报访问控制规则
     *
     * 选中多个策略为这些策略批量添加威胁情报访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateIpReputationRuleRequest 请求对象
     * @return CompletableFuture<BatchCreateIpReputationRuleResponse>
     */
    public CompletableFuture<BatchCreateIpReputationRuleResponse> batchCreateIpReputationRuleAsync(
        BatchCreateIpReputationRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.batchCreateIpReputationRule);
    }

    /**
     * 为多个策略批量添加威胁情报访问控制规则
     *
     * 选中多个策略为这些策略批量添加威胁情报访问控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateIpReputationRuleRequest 请求对象
     * @return AsyncInvoker<BatchCreateIpReputationRuleRequest, BatchCreateIpReputationRuleResponse>
     */
    public AsyncInvoker<BatchCreateIpReputationRuleRequest, BatchCreateIpReputationRuleResponse> batchCreateIpReputationRuleAsyncInvoker(
        BatchCreateIpReputationRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.batchCreateIpReputationRule, hcClient);
    }

    /**
     * 选中多个策略批量添加隐私屏蔽防护防护规则
     *
     * 选中多个策略为这些策略批量添加隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePrivacyRuleRequest 请求对象
     * @return CompletableFuture<BatchCreatePrivacyRuleResponse>
     */
    public CompletableFuture<BatchCreatePrivacyRuleResponse> batchCreatePrivacyRuleAsync(
        BatchCreatePrivacyRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.batchCreatePrivacyRule);
    }

    /**
     * 选中多个策略批量添加隐私屏蔽防护防护规则
     *
     * 选中多个策略为这些策略批量添加隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePrivacyRuleRequest 请求对象
     * @return AsyncInvoker<BatchCreatePrivacyRuleRequest, BatchCreatePrivacyRuleResponse>
     */
    public AsyncInvoker<BatchCreatePrivacyRuleRequest, BatchCreatePrivacyRuleResponse> batchCreatePrivacyRuleAsyncInvoker(
        BatchCreatePrivacyRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.batchCreatePrivacyRule, hcClient);
    }

    /**
     * 选中多个策略批量添加黑白名单防护规则
     *
     * 选中多个策略为这些策略批量添加黑白名单防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateWhiteblackipRuleRequest 请求对象
     * @return CompletableFuture<BatchCreateWhiteblackipRuleResponse>
     */
    public CompletableFuture<BatchCreateWhiteblackipRuleResponse> batchCreateWhiteblackipRuleAsync(
        BatchCreateWhiteblackipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.batchCreateWhiteblackipRule);
    }

    /**
     * 选中多个策略批量添加黑白名单防护规则
     *
     * 选中多个策略为这些策略批量添加黑白名单防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateWhiteblackipRuleRequest 请求对象
     * @return AsyncInvoker<BatchCreateWhiteblackipRuleRequest, BatchCreateWhiteblackipRuleResponse>
     */
    public AsyncInvoker<BatchCreateWhiteblackipRuleRequest, BatchCreateWhiteblackipRuleResponse> batchCreateWhiteblackipRuleAsyncInvoker(
        BatchCreateWhiteblackipRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.batchCreateWhiteblackipRule, hcClient);
    }

    /**
     * 批量删除告警通知
     *
     * 批量删除告警通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAlertNoticeConfigRequest 请求对象
     * @return CompletableFuture<BatchDeleteAlertNoticeConfigResponse>
     */
    public CompletableFuture<BatchDeleteAlertNoticeConfigResponse> batchDeleteAlertNoticeConfigAsync(
        BatchDeleteAlertNoticeConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.batchDeleteAlertNoticeConfig);
    }

    /**
     * 批量删除告警通知
     *
     * 批量删除告警通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteAlertNoticeConfigRequest 请求对象
     * @return AsyncInvoker<BatchDeleteAlertNoticeConfigRequest, BatchDeleteAlertNoticeConfigResponse>
     */
    public AsyncInvoker<BatchDeleteAlertNoticeConfigRequest, BatchDeleteAlertNoticeConfigResponse> batchDeleteAlertNoticeConfigAsyncInvoker(
        BatchDeleteAlertNoticeConfigRequest request) {
        return new AsyncInvoker<>(request, WafMeta.batchDeleteAlertNoticeConfig, hcClient);
    }

    /**
     * 批量删除防护策略
     *
     * 批量删除防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePoliciesRequest 请求对象
     * @return CompletableFuture<BatchDeletePoliciesResponse>
     */
    public CompletableFuture<BatchDeletePoliciesResponse> batchDeletePoliciesAsync(BatchDeletePoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.batchDeletePolicies);
    }

    /**
     * 批量删除防护策略
     *
     * 批量删除防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePoliciesRequest 请求对象
     * @return AsyncInvoker<BatchDeletePoliciesRequest, BatchDeletePoliciesResponse>
     */
    public AsyncInvoker<BatchDeletePoliciesRequest, BatchDeletePoliciesResponse> batchDeletePoliciesAsyncInvoker(
        BatchDeletePoliciesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.batchDeletePolicies, hcClient);
    }

    /**
     * 变更包周期云模式waf规格
     *
     * 变更包周期云模式waf规格。注：
     *  - 1.变更某产品规格的前提是必须已购买该产品 
     *  - 2.waf版本只支持升配，不支持降配；扩展包数量可以增加或者减少，但不支持数量减少为0 
     *  - 3.不支持同时升降配，如增加域名扩展包数量，同时减少规则扩展包数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePrepaidCloudWafRequest 请求对象
     * @return CompletableFuture<ChangePrepaidCloudWafResponse>
     */
    public CompletableFuture<ChangePrepaidCloudWafResponse> changePrepaidCloudWafAsync(
        ChangePrepaidCloudWafRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.changePrepaidCloudWaf);
    }

    /**
     * 变更包周期云模式waf规格
     *
     * 变更包周期云模式waf规格。注：
     *  - 1.变更某产品规格的前提是必须已购买该产品 
     *  - 2.waf版本只支持升配，不支持降配；扩展包数量可以增加或者减少，但不支持数量减少为0 
     *  - 3.不支持同时升降配，如增加域名扩展包数量，同时减少规则扩展包数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePrepaidCloudWafRequest 请求对象
     * @return AsyncInvoker<ChangePrepaidCloudWafRequest, ChangePrepaidCloudWafResponse>
     */
    public AsyncInvoker<ChangePrepaidCloudWafRequest, ChangePrepaidCloudWafResponse> changePrepaidCloudWafAsyncInvoker(
        ChangePrepaidCloudWafRequest request) {
        return new AsyncInvoker<>(request, WafMeta.changePrepaidCloudWaf, hcClient);
    }

    /**
     * 查询独享引擎代理
     *
     * 查询独享引擎的代理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckAgencyRequest 请求对象
     * @return CompletableFuture<CheckAgencyResponse>
     */
    public CompletableFuture<CheckAgencyResponse> checkAgencyAsync(CheckAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.checkAgency);
    }

    /**
     * 查询独享引擎代理
     *
     * 查询独享引擎的代理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckAgencyRequest 请求对象
     * @return AsyncInvoker<CheckAgencyRequest, CheckAgencyResponse>
     */
    public AsyncInvoker<CheckAgencyRequest, CheckAgencyResponse> checkAgencyAsyncInvoker(CheckAgencyRequest request) {
        return new AsyncInvoker<>(request, WafMeta.checkAgency, hcClient);
    }

    /**
     * 按application规则类型获取内置规则类型
     *
     * 按application规则类型获取内置规则类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmApplicationTypesRequest 请求对象
     * @return CompletableFuture<ConfirmApplicationTypesResponse>
     */
    public CompletableFuture<ConfirmApplicationTypesResponse> confirmApplicationTypesAsync(
        ConfirmApplicationTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.confirmApplicationTypes);
    }

    /**
     * 按application规则类型获取内置规则类型
     *
     * 按application规则类型获取内置规则类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmApplicationTypesRequest 请求对象
     * @return AsyncInvoker<ConfirmApplicationTypesRequest, ConfirmApplicationTypesResponse>
     */
    public AsyncInvoker<ConfirmApplicationTypesRequest, ConfirmApplicationTypesResponse> confirmApplicationTypesAsyncInvoker(
        ConfirmApplicationTypesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.confirmApplicationTypes, hcClient);
    }

    /**
     * 查询异步任务详情
     *
     * 查询异步任务的执行状态详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmAsyncJobRequest 请求对象
     * @return CompletableFuture<ConfirmAsyncJobResponse>
     */
    public CompletableFuture<ConfirmAsyncJobResponse> confirmAsyncJobAsync(ConfirmAsyncJobRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.confirmAsyncJob);
    }

    /**
     * 查询异步任务详情
     *
     * 查询异步任务的执行状态详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmAsyncJobRequest 请求对象
     * @return AsyncInvoker<ConfirmAsyncJobRequest, ConfirmAsyncJobResponse>
     */
    public AsyncInvoker<ConfirmAsyncJobRequest, ConfirmAsyncJobResponse> confirmAsyncJobAsyncInvoker(
        ConfirmAsyncJobRequest request) {
        return new AsyncInvoker<>(request, WafMeta.confirmAsyncJob, hcClient);
    }

    /**
     * 根据Id查询机房IP情报防护规则
     *
     * 根据Id查询机房IP情报防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmIpReputationRuleRequest 请求对象
     * @return CompletableFuture<ConfirmIpReputationRuleResponse>
     */
    public CompletableFuture<ConfirmIpReputationRuleResponse> confirmIpReputationRuleAsync(
        ConfirmIpReputationRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.confirmIpReputationRule);
    }

    /**
     * 根据Id查询机房IP情报防护规则
     *
     * 根据Id查询机房IP情报防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmIpReputationRuleRequest 请求对象
     * @return AsyncInvoker<ConfirmIpReputationRuleRequest, ConfirmIpReputationRuleResponse>
     */
    public AsyncInvoker<ConfirmIpReputationRuleRequest, ConfirmIpReputationRuleResponse> confirmIpReputationRuleAsyncInvoker(
        ConfirmIpReputationRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.confirmIpReputationRule, hcClient);
    }

    /**
     * 查询敏感信息选项的详细信息
     *
     * 查询敏感信息选项的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmPolicyAntileakageMapRequest 请求对象
     * @return CompletableFuture<ConfirmPolicyAntileakageMapResponse>
     */
    public CompletableFuture<ConfirmPolicyAntileakageMapResponse> confirmPolicyAntileakageMapAsync(
        ConfirmPolicyAntileakageMapRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.confirmPolicyAntileakageMap);
    }

    /**
     * 查询敏感信息选项的详细信息
     *
     * 查询敏感信息选项的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmPolicyAntileakageMapRequest 请求对象
     * @return AsyncInvoker<ConfirmPolicyAntileakageMapRequest, ConfirmPolicyAntileakageMapResponse>
     */
    public AsyncInvoker<ConfirmPolicyAntileakageMapRequest, ConfirmPolicyAntileakageMapResponse> confirmPolicyAntileakageMapAsyncInvoker(
        ConfirmPolicyAntileakageMapRequest request) {
        return new AsyncInvoker<>(request, WafMeta.confirmPolicyAntileakageMap, hcClient);
    }

    /**
     * 查询威胁情报控制防护选项的详细信息
     *
     * 查询威胁情报控制防护选项的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmPolicyIpReputationMapRequest 请求对象
     * @return CompletableFuture<ConfirmPolicyIpReputationMapResponse>
     */
    public CompletableFuture<ConfirmPolicyIpReputationMapResponse> confirmPolicyIpReputationMapAsync(
        ConfirmPolicyIpReputationMapRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.confirmPolicyIpReputationMap);
    }

    /**
     * 查询威胁情报控制防护选项的详细信息
     *
     * 查询威胁情报控制防护选项的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmPolicyIpReputationMapRequest 请求对象
     * @return AsyncInvoker<ConfirmPolicyIpReputationMapRequest, ConfirmPolicyIpReputationMapResponse>
     */
    public AsyncInvoker<ConfirmPolicyIpReputationMapRequest, ConfirmPolicyIpReputationMapResponse> confirmPolicyIpReputationMapAsyncInvoker(
        ConfirmPolicyIpReputationMapRequest request) {
        return new AsyncInvoker<>(request, WafMeta.confirmPolicyIpReputationMap, hcClient);
    }

    /**
     * 按防护规则类型获取内置规则类型
     *
     * 按防护规则类型获取内置规则类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmProtectionTypesRequest 请求对象
     * @return CompletableFuture<ConfirmProtectionTypesResponse>
     */
    public CompletableFuture<ConfirmProtectionTypesResponse> confirmProtectionTypesAsync(
        ConfirmProtectionTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.confirmProtectionTypes);
    }

    /**
     * 按防护规则类型获取内置规则类型
     *
     * 按防护规则类型获取内置规则类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmProtectionTypesRequest 请求对象
     * @return AsyncInvoker<ConfirmProtectionTypesRequest, ConfirmProtectionTypesResponse>
     */
    public AsyncInvoker<ConfirmProtectionTypesRequest, ConfirmProtectionTypesResponse> confirmProtectionTypesAsyncInvoker(
        ConfirmProtectionTypesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.confirmProtectionTypes, hcClient);
    }

    /**
     * SMN告警通知
     *
     * 查询告警可选事件类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmThreatMapRequest 请求对象
     * @return CompletableFuture<ConfirmThreatMapResponse>
     */
    public CompletableFuture<ConfirmThreatMapResponse> confirmThreatMapAsync(ConfirmThreatMapRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.confirmThreatMap);
    }

    /**
     * SMN告警通知
     *
     * 查询告警可选事件类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmThreatMapRequest 请求对象
     * @return AsyncInvoker<ConfirmThreatMapRequest, ConfirmThreatMapResponse>
     */
    public AsyncInvoker<ConfirmThreatMapRequest, ConfirmThreatMapResponse> confirmThreatMapAsyncInvoker(
        ConfirmThreatMapRequest request) {
        return new AsyncInvoker<>(request, WafMeta.confirmThreatMap, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 使用标签过滤实例，标签管理服务需要提供按标签过滤各服务实例并汇总显示在列表中，需要各服务提供查询能力。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmTmsResourceInstancesRequest 请求对象
     * @return CompletableFuture<ConfirmTmsResourceInstancesResponse>
     */
    public CompletableFuture<ConfirmTmsResourceInstancesResponse> confirmTmsResourceInstancesAsync(
        ConfirmTmsResourceInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.confirmTmsResourceInstances);
    }

    /**
     * 查询资源实例
     *
     * 使用标签过滤实例，标签管理服务需要提供按标签过滤各服务实例并汇总显示在列表中，需要各服务提供查询能力。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmTmsResourceInstancesRequest 请求对象
     * @return AsyncInvoker<ConfirmTmsResourceInstancesRequest, ConfirmTmsResourceInstancesResponse>
     */
    public AsyncInvoker<ConfirmTmsResourceInstancesRequest, ConfirmTmsResourceInstancesResponse> confirmTmsResourceInstancesAsyncInvoker(
        ConfirmTmsResourceInstancesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.confirmTmsResourceInstances, hcClient);
    }

    /**
     * 获取用户套餐信息
     *
     * 获取用户购买的WAF规格信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmUserBundleRequest 请求对象
     * @return CompletableFuture<ConfirmUserBundleResponse>
     */
    public CompletableFuture<ConfirmUserBundleResponse> confirmUserBundleAsync(ConfirmUserBundleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.confirmUserBundle);
    }

    /**
     * 获取用户套餐信息
     *
     * 获取用户购买的WAF规格信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmUserBundleRequest 请求对象
     * @return AsyncInvoker<ConfirmUserBundleRequest, ConfirmUserBundleResponse>
     */
    public AsyncInvoker<ConfirmUserBundleRequest, ConfirmUserBundleResponse> confirmUserBundleAsyncInvoker(
        ConfirmUserBundleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.confirmUserBundle, hcClient);
    }

    /**
     * 创建代理
     *
     * 创建独享引擎的代理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgencyRequest 请求对象
     * @return CompletableFuture<CreateAgencyResponse>
     */
    public CompletableFuture<CreateAgencyResponse> createAgencyAsync(CreateAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createAgency);
    }

    /**
     * 创建代理
     *
     * 创建独享引擎的代理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAgencyRequest 请求对象
     * @return AsyncInvoker<CreateAgencyRequest, CreateAgencyResponse>
     */
    public AsyncInvoker<CreateAgencyRequest, CreateAgencyResponse> createAgencyAsyncInvoker(
        CreateAgencyRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createAgency, hcClient);
    }

    /**
     * 创建告警通知
     *
     * 创建告警通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertNoticeConfigRequest 请求对象
     * @return CompletableFuture<CreateAlertNoticeConfigResponse>
     */
    public CompletableFuture<CreateAlertNoticeConfigResponse> createAlertNoticeConfigAsync(
        CreateAlertNoticeConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createAlertNoticeConfig);
    }

    /**
     * 创建告警通知
     *
     * 创建告警通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAlertNoticeConfigRequest 请求对象
     * @return AsyncInvoker<CreateAlertNoticeConfigRequest, CreateAlertNoticeConfigResponse>
     */
    public AsyncInvoker<CreateAlertNoticeConfigRequest, CreateAlertNoticeConfigResponse> createAlertNoticeConfigAsyncInvoker(
        CreateAlertNoticeConfigRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createAlertNoticeConfig, hcClient);
    }

    /**
     * 创建防篡改规则
     *
     * 创建防篡改规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAntiTamperRuleRequest 请求对象
     * @return CompletableFuture<CreateAntiTamperRuleResponse>
     */
    public CompletableFuture<CreateAntiTamperRuleResponse> createAntiTamperRuleAsync(
        CreateAntiTamperRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createAntiTamperRule);
    }

    /**
     * 创建防篡改规则
     *
     * 创建防篡改规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAntiTamperRuleRequest 请求对象
     * @return AsyncInvoker<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse>
     */
    public AsyncInvoker<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse> createAntiTamperRuleAsyncInvoker(
        CreateAntiTamperRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createAntiTamperRule, hcClient);
    }

    /**
     * 创建JS脚本反爬虫规则
     *
     * 创建JS脚本反爬虫规则，在调用此接口创建防护规则前，需要调用更新JS脚本反爬虫规则防护模式（UpdateAnticrawlerRuleType）接口指定防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAnticrawlerRuleRequest 请求对象
     * @return CompletableFuture<CreateAnticrawlerRuleResponse>
     */
    public CompletableFuture<CreateAnticrawlerRuleResponse> createAnticrawlerRuleAsync(
        CreateAnticrawlerRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createAnticrawlerRule);
    }

    /**
     * 创建JS脚本反爬虫规则
     *
     * 创建JS脚本反爬虫规则，在调用此接口创建防护规则前，需要调用更新JS脚本反爬虫规则防护模式（UpdateAnticrawlerRuleType）接口指定防护模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAnticrawlerRuleRequest 请求对象
     * @return AsyncInvoker<CreateAnticrawlerRuleRequest, CreateAnticrawlerRuleResponse>
     */
    public AsyncInvoker<CreateAnticrawlerRuleRequest, CreateAnticrawlerRuleResponse> createAnticrawlerRuleAsyncInvoker(
        CreateAnticrawlerRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createAnticrawlerRule, hcClient);
    }

    /**
     * 创建防敏感信息泄露规则
     *
     * 创建防敏感信息泄露规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAntileakageRuleRequest 请求对象
     * @return CompletableFuture<CreateAntileakageRuleResponse>
     */
    public CompletableFuture<CreateAntileakageRuleResponse> createAntileakageRuleAsync(
        CreateAntileakageRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createAntileakageRule);
    }

    /**
     * 创建防敏感信息泄露规则
     *
     * 创建防敏感信息泄露规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAntileakageRuleRequest 请求对象
     * @return AsyncInvoker<CreateAntileakageRuleRequest, CreateAntileakageRuleResponse>
     */
    public AsyncInvoker<CreateAntileakageRuleRequest, CreateAntileakageRuleResponse> createAntileakageRuleAsyncInvoker(
        CreateAntileakageRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createAntileakageRule, hcClient);
    }

    /**
     * 创建cc规则
     *
     * 创建cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCcRuleRequest 请求对象
     * @return CompletableFuture<CreateCcRuleResponse>
     */
    public CompletableFuture<CreateCcRuleResponse> createCcRuleAsync(CreateCcRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createCcRule);
    }

    /**
     * 创建cc规则
     *
     * 创建cc规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCcRuleRequest 请求对象
     * @return AsyncInvoker<CreateCcRuleRequest, CreateCcRuleResponse>
     */
    public AsyncInvoker<CreateCcRuleRequest, CreateCcRuleResponse> createCcRuleAsyncInvoker(
        CreateCcRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createCcRule, hcClient);
    }

    /**
     * 创建证书
     *
     * 创建证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateRequest 请求对象
     * @return CompletableFuture<CreateCertificateResponse>
     */
    public CompletableFuture<CreateCertificateResponse> createCertificateAsync(CreateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createCertificate);
    }

    /**
     * 创建证书
     *
     * 创建证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCertificateRequest 请求对象
     * @return AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse>
     */
    public AsyncInvoker<CreateCertificateRequest, CreateCertificateResponse> createCertificateAsyncInvoker(
        CreateCertificateRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createCertificate, hcClient);
    }

    /**
     * 开通云模式按需计费接口
     *
     * 开通云模式按需计费接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCloudWafPostPaidResourceRequest 请求对象
     * @return CompletableFuture<CreateCloudWafPostPaidResourceResponse>
     */
    public CompletableFuture<CreateCloudWafPostPaidResourceResponse> createCloudWafPostPaidResourceAsync(
        CreateCloudWafPostPaidResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createCloudWafPostPaidResource);
    }

    /**
     * 开通云模式按需计费接口
     *
     * 开通云模式按需计费接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCloudWafPostPaidResourceRequest 请求对象
     * @return AsyncInvoker<CreateCloudWafPostPaidResourceRequest, CreateCloudWafPostPaidResourceResponse>
     */
    public AsyncInvoker<CreateCloudWafPostPaidResourceRequest, CreateCloudWafPostPaidResourceResponse> createCloudWafPostPaidResourceAsyncInvoker(
        CreateCloudWafPostPaidResourceRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createCloudWafPostPaidResource, hcClient);
    }

    /**
     * 创建精准防护规则
     *
     * 创建精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomRuleRequest 请求对象
     * @return CompletableFuture<CreateCustomRuleResponse>
     */
    public CompletableFuture<CreateCustomRuleResponse> createCustomRuleAsync(CreateCustomRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createCustomRule);
    }

    /**
     * 创建精准防护规则
     *
     * 创建精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomRuleRequest 请求对象
     * @return AsyncInvoker<CreateCustomRuleRequest, CreateCustomRuleResponse>
     */
    public AsyncInvoker<CreateCustomRuleRequest, CreateCustomRuleResponse> createCustomRuleAsyncInvoker(
        CreateCustomRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createCustomRule, hcClient);
    }

    /**
     * 创建地理位置控制规则
     *
     * 创建地理位置控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGeoipRuleRequest 请求对象
     * @return CompletableFuture<CreateGeoipRuleResponse>
     */
    public CompletableFuture<CreateGeoipRuleResponse> createGeoipRuleAsync(CreateGeoipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createGeoipRule);
    }

    /**
     * 创建地理位置控制规则
     *
     * 创建地理位置控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGeoipRuleRequest 请求对象
     * @return AsyncInvoker<CreateGeoipRuleRequest, CreateGeoipRuleResponse>
     */
    public AsyncInvoker<CreateGeoipRuleRequest, CreateGeoipRuleResponse> createGeoipRuleAsyncInvoker(
        CreateGeoipRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createGeoipRule, hcClient);
    }

    /**
     * 创建云模式防护域名
     *
     * 创建云模式防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHostRequest 请求对象
     * @return CompletableFuture<CreateHostResponse>
     */
    public CompletableFuture<CreateHostResponse> createHostAsync(CreateHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createHost);
    }

    /**
     * 创建云模式防护域名
     *
     * 创建云模式防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHostRequest 请求对象
     * @return AsyncInvoker<CreateHostRequest, CreateHostResponse>
     */
    public AsyncInvoker<CreateHostRequest, CreateHostResponse> createHostAsyncInvoker(CreateHostRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createHost, hcClient);
    }

    /**
     * 创建全局白名单(原误报屏蔽)规则
     *
     * 创建全局白名单(原误报屏蔽)规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIgnoreRuleRequest 请求对象
     * @return CompletableFuture<CreateIgnoreRuleResponse>
     */
    public CompletableFuture<CreateIgnoreRuleResponse> createIgnoreRuleAsync(CreateIgnoreRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createIgnoreRule);
    }

    /**
     * 创建全局白名单(原误报屏蔽)规则
     *
     * 创建全局白名单(原误报屏蔽)规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIgnoreRuleRequest 请求对象
     * @return AsyncInvoker<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse>
     */
    public AsyncInvoker<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse> createIgnoreRuleAsyncInvoker(
        CreateIgnoreRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createIgnoreRule, hcClient);
    }

    /**
     * 创建WAF独享引擎实例
     *
     * 创建WAF独享引擎实例。独享模式支持的局点包括：华东-青岛、中东-利雅得、华北-北京一、华北-北京四、华北-乌兰察布一、华东-上海一、华东-上海二、华南-广州、华南-深圳、中国-香港、西南-贵阳一、亚太-曼谷、 亚太-新加坡、非洲约翰内斯堡、土耳其-伊斯坦布尔；普通租户类独享支持的局点：华北-北京四、华东-上海一、华南-广州、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createInstance);
    }

    /**
     * 创建WAF独享引擎实例
     *
     * 创建WAF独享引擎实例。独享模式支持的局点包括：华东-青岛、中东-利雅得、华北-北京一、华北-北京四、华北-乌兰察布一、华东-上海一、华东-上海二、华南-广州、华南-深圳、中国-香港、西南-贵阳一、亚太-曼谷、 亚太-新加坡、非洲约翰内斯堡、土耳其-伊斯坦布尔；普通租户类独享支持的局点：华北-北京四、华东-上海一、华南-广州、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createInstance, hcClient);
    }

    /**
     * 创建ip地址组
     *
     * 创建ip地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpGroupRequest 请求对象
     * @return CompletableFuture<CreateIpGroupResponse>
     */
    public CompletableFuture<CreateIpGroupResponse> createIpGroupAsync(CreateIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createIpGroup);
    }

    /**
     * 创建ip地址组
     *
     * 创建ip地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpGroupRequest 请求对象
     * @return AsyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse>
     */
    public AsyncInvoker<CreateIpGroupRequest, CreateIpGroupResponse> createIpGroupAsyncInvoker(
        CreateIpGroupRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createIpGroup, hcClient);
    }

    /**
     * 创建机房IP情报规则
     *
     * 创建IP情报规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpReputationRuleRequest 请求对象
     * @return CompletableFuture<CreateIpReputationRuleResponse>
     */
    public CompletableFuture<CreateIpReputationRuleResponse> createIpReputationRuleAsync(
        CreateIpReputationRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createIpReputationRule);
    }

    /**
     * 创建机房IP情报规则
     *
     * 创建IP情报规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIpReputationRuleRequest 请求对象
     * @return AsyncInvoker<CreateIpReputationRuleRequest, CreateIpReputationRuleResponse>
     */
    public AsyncInvoker<CreateIpReputationRuleRequest, CreateIpReputationRuleResponse> createIpReputationRuleAsyncInvoker(
        CreateIpReputationRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createIpReputationRule, hcClient);
    }

    /**
     * 创建防护策略
     *
     * 创建防护策略，系统会在生成策略时配置一些默认的配置项，如果需要修改策略的默认配置项需要通过调用更新防护策略接口实现
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyRequest 请求对象
     * @return CompletableFuture<CreatePolicyResponse>
     */
    public CompletableFuture<CreatePolicyResponse> createPolicyAsync(CreatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createPolicy);
    }

    /**
     * 创建防护策略
     *
     * 创建防护策略，系统会在生成策略时配置一些默认的配置项，如果需要修改策略的默认配置项需要通过调用更新防护策略接口实现
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyRequest 请求对象
     * @return AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse>
     */
    public AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyAsyncInvoker(
        CreatePolicyRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createPolicy, hcClient);
    }

    /**
     * 创建独享模式域名或者创建云模式ELB接入模式域名
     *
     * 创建独享模式域名或者创建云模式ELB接入模式域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePremiumHostRequest 请求对象
     * @return CompletableFuture<CreatePremiumHostResponse>
     */
    public CompletableFuture<CreatePremiumHostResponse> createPremiumHostAsync(CreatePremiumHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createPremiumHost);
    }

    /**
     * 创建独享模式域名或者创建云模式ELB接入模式域名
     *
     * 创建独享模式域名或者创建云模式ELB接入模式域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePremiumHostRequest 请求对象
     * @return AsyncInvoker<CreatePremiumHostRequest, CreatePremiumHostResponse>
     */
    public AsyncInvoker<CreatePremiumHostRequest, CreatePremiumHostResponse> createPremiumHostAsyncInvoker(
        CreatePremiumHostRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createPremiumHost, hcClient);
    }

    /**
     * 购买包周期云模式waf
     *
     * 购买包周期云模式waf。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrepaidCloudWafRequest 请求对象
     * @return CompletableFuture<CreatePrepaidCloudWafResponse>
     */
    public CompletableFuture<CreatePrepaidCloudWafResponse> createPrepaidCloudWafAsync(
        CreatePrepaidCloudWafRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createPrepaidCloudWaf);
    }

    /**
     * 购买包周期云模式waf
     *
     * 购买包周期云模式waf。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrepaidCloudWafRequest 请求对象
     * @return AsyncInvoker<CreatePrepaidCloudWafRequest, CreatePrepaidCloudWafResponse>
     */
    public AsyncInvoker<CreatePrepaidCloudWafRequest, CreatePrepaidCloudWafResponse> createPrepaidCloudWafAsyncInvoker(
        CreatePrepaidCloudWafRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createPrepaidCloudWaf, hcClient);
    }

    /**
     * 创建隐私屏蔽防护规则
     *
     * 创建隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivacyRuleRequest 请求对象
     * @return CompletableFuture<CreatePrivacyRuleResponse>
     */
    public CompletableFuture<CreatePrivacyRuleResponse> createPrivacyRuleAsync(CreatePrivacyRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createPrivacyRule);
    }

    /**
     * 创建隐私屏蔽防护规则
     *
     * 创建隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivacyRuleRequest 请求对象
     * @return AsyncInvoker<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse>
     */
    public AsyncInvoker<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse> createPrivacyRuleAsyncInvoker(
        CreatePrivacyRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createPrivacyRule, hcClient);
    }

    /**
     * 创建攻击惩罚规则
     *
     * 创建攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePunishmentRuleRequest 请求对象
     * @return CompletableFuture<CreatePunishmentRuleResponse>
     */
    public CompletableFuture<CreatePunishmentRuleResponse> createPunishmentRuleAsync(
        CreatePunishmentRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createPunishmentRule);
    }

    /**
     * 创建攻击惩罚规则
     *
     * 创建攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePunishmentRuleRequest 请求对象
     * @return AsyncInvoker<CreatePunishmentRuleRequest, CreatePunishmentRuleResponse>
     */
    public AsyncInvoker<CreatePunishmentRuleRequest, CreatePunishmentRuleResponse> createPunishmentRuleAsyncInvoker(
        CreatePunishmentRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createPunishmentRule, hcClient);
    }

    /**
     * 创建引用表
     *
     * 创建引用表，引用表能够被CC攻击防护规则和精准访问防护中的规则所引用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateValueListRequest 请求对象
     * @return CompletableFuture<CreateValueListResponse>
     */
    public CompletableFuture<CreateValueListResponse> createValueListAsync(CreateValueListRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createValueList);
    }

    /**
     * 创建引用表
     *
     * 创建引用表，引用表能够被CC攻击防护规则和精准访问防护中的规则所引用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateValueListRequest 请求对象
     * @return AsyncInvoker<CreateValueListRequest, CreateValueListResponse>
     */
    public AsyncInvoker<CreateValueListRequest, CreateValueListResponse> createValueListAsyncInvoker(
        CreateValueListRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createValueList, hcClient);
    }

    /**
     * 创建黑白名单规则
     *
     * 创建黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWhiteblackipRuleRequest 请求对象
     * @return CompletableFuture<CreateWhiteblackipRuleResponse>
     */
    public CompletableFuture<CreateWhiteblackipRuleResponse> createWhiteblackipRuleAsync(
        CreateWhiteblackipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createWhiteblackipRule);
    }

    /**
     * 创建黑白名单规则
     *
     * 创建黑白名单规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWhiteblackipRuleRequest 请求对象
     * @return AsyncInvoker<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse>
     */
    public AsyncInvoker<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse> createWhiteblackipRuleAsyncInvoker(
        CreateWhiteblackipRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createWhiteblackipRule, hcClient);
    }

    /**
     * 删除代理
     *
     * 删除独享引擎的代理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgencyRequest 请求对象
     * @return CompletableFuture<DeleteAgencyResponse>
     */
    public CompletableFuture<DeleteAgencyResponse> deleteAgencyAsync(DeleteAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteAgency);
    }

    /**
     * 删除代理
     *
     * 删除独享引擎的代理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAgencyRequest 请求对象
     * @return AsyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse>
     */
    public AsyncInvoker<DeleteAgencyRequest, DeleteAgencyResponse> deleteAgencyAsyncInvoker(
        DeleteAgencyRequest request) {
        return new AsyncInvoker<>(request, WafMeta.deleteAgency, hcClient);
    }

    /**
     * 删除JS脚本反爬虫防护规则
     *
     * 删除JS脚本反爬虫防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAnticrawlerRuleRequest 请求对象
     * @return CompletableFuture<DeleteAnticrawlerRuleResponse>
     */
    public CompletableFuture<DeleteAnticrawlerRuleResponse> deleteAnticrawlerRuleAsync(
        DeleteAnticrawlerRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteAnticrawlerRule);
    }

    /**
     * 删除JS脚本反爬虫防护规则
     *
     * 删除JS脚本反爬虫防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAnticrawlerRuleRequest 请求对象
     * @return AsyncInvoker<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse>
     */
    public AsyncInvoker<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse> deleteAnticrawlerRuleAsyncInvoker(
        DeleteAnticrawlerRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.deleteAnticrawlerRule, hcClient);
    }

    /**
     * 删除防敏感信息泄露防护规则
     *
     * 删除防敏感信息泄露防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAntileakageRuleRequest 请求对象
     * @return CompletableFuture<DeleteAntileakageRuleResponse>
     */
    public CompletableFuture<DeleteAntileakageRuleResponse> deleteAntileakageRuleAsync(
        DeleteAntileakageRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteAntileakageRule);
    }

    /**
     * 删除防敏感信息泄露防护规则
     *
     * 删除防敏感信息泄露防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAntileakageRuleRequest 请求对象
     * @return AsyncInvoker<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse>
     */
    public AsyncInvoker<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse> deleteAntileakageRuleAsyncInvoker(
        DeleteAntileakageRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.deleteAntileakageRule, hcClient);
    }

    /**
     * 删除防篡改防护规则
     *
     * 删除防篡改防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAntitamperRuleRequest 请求对象
     * @return CompletableFuture<DeleteAntitamperRuleResponse>
     */
    public CompletableFuture<DeleteAntitamperRuleResponse> deleteAntitamperRuleAsync(
        DeleteAntitamperRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteAntitamperRule);
    }

    /**
     * 删除防篡改防护规则
     *
     * 删除防篡改防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAntitamperRuleRequest 请求对象
     * @return AsyncInvoker<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse>
     */
    public AsyncInvoker<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse> deleteAntitamperRuleAsyncInvoker(
        DeleteAntitamperRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.deleteAntitamperRule, hcClient);
    }

    /**
     * 删除cc防护规则
     *
     * 删除cc防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCcRuleRequest 请求对象
     * @return CompletableFuture<DeleteCcRuleResponse>
     */
    public CompletableFuture<DeleteCcRuleResponse> deleteCcRuleAsync(DeleteCcRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteCcRule);
    }

    /**
     * 删除cc防护规则
     *
     * 删除cc防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCcRuleRequest 请求对象
     * @return AsyncInvoker<DeleteCcRuleRequest, DeleteCcRuleResponse>
     */
    public AsyncInvoker<DeleteCcRuleRequest, DeleteCcRuleResponse> deleteCcRuleAsyncInvoker(
        DeleteCcRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.deleteCcRule, hcClient);
    }

    /**
     * 删除证书
     *
     * 删除证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateRequest 请求对象
     * @return CompletableFuture<DeleteCertificateResponse>
     */
    public CompletableFuture<DeleteCertificateResponse> deleteCertificateAsync(DeleteCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteCertificate);
    }

    /**
     * 删除证书
     *
     * 删除证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCertificateRequest 请求对象
     * @return AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>
     */
    public AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateAsyncInvoker(
        DeleteCertificateRequest request) {
        return new AsyncInvoker<>(request, WafMeta.deleteCertificate, hcClient);
    }

    /**
     * 关闭云模式按需计费接口
     *
     * 关闭云模式按需计费接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCloudWafPostPaidResourceRequest 请求对象
     * @return CompletableFuture<DeleteCloudWafPostPaidResourceResponse>
     */
    public CompletableFuture<DeleteCloudWafPostPaidResourceResponse> deleteCloudWafPostPaidResourceAsync(
        DeleteCloudWafPostPaidResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteCloudWafPostPaidResource);
    }

    /**
     * 关闭云模式按需计费接口
     *
     * 关闭云模式按需计费接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCloudWafPostPaidResourceRequest 请求对象
     * @return AsyncInvoker<DeleteCloudWafPostPaidResourceRequest, DeleteCloudWafPostPaidResourceResponse>
     */
    public AsyncInvoker<DeleteCloudWafPostPaidResourceRequest, DeleteCloudWafPostPaidResourceResponse> deleteCloudWafPostPaidResourceAsyncInvoker(
        DeleteCloudWafPostPaidResourceRequest request) {
        return new AsyncInvoker<>(request, WafMeta.deleteCloudWafPostPaidResource, hcClient);
    }

    /**
     * 删除精准防护规则
     *
     * 删除精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomRuleRequest 请求对象
     * @return CompletableFuture<DeleteCustomRuleResponse>
     */
    public CompletableFuture<DeleteCustomRuleResponse> deleteCustomRuleAsync(DeleteCustomRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteCustomRule);
    }

    /**
     * 删除精准防护规则
     *
     * 删除精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomRuleRequest 请求对象
     * @return AsyncInvoker<DeleteCustomRuleRequest, DeleteCustomRuleResponse>
     */
    public AsyncInvoker<DeleteCustomRuleRequest, DeleteCustomRuleResponse> deleteCustomRuleAsyncInvoker(
        DeleteCustomRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.deleteCustomRule, hcClient);
    }

    /**
     * 删除地理位置控制防护规则
     *
     * 删除地理位置控制防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGeoipRuleRequest 请求对象
     * @return CompletableFuture<DeleteGeoipRuleResponse>
     */
    public CompletableFuture<DeleteGeoipRuleResponse> deleteGeoipRuleAsync(DeleteGeoipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteGeoipRule);
    }

    /**
     * 删除地理位置控制防护规则
     *
     * 删除地理位置控制防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGeoipRuleRequest 请求对象
     * @return AsyncInvoker<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse>
     */
    public AsyncInvoker<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> deleteGeoipRuleAsyncInvoker(
        DeleteGeoipRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.deleteGeoipRule, hcClient);
    }

    /**
     * 删除云模式防护域名
     *
     * 删除云模式防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostRequest 请求对象
     * @return CompletableFuture<DeleteHostResponse>
     */
    public CompletableFuture<DeleteHostResponse> deleteHostAsync(DeleteHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteHost);
    }

    /**
     * 删除云模式防护域名
     *
     * 删除云模式防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHostRequest 请求对象
     * @return AsyncInvoker<DeleteHostRequest, DeleteHostResponse>
     */
    public AsyncInvoker<DeleteHostRequest, DeleteHostResponse> deleteHostAsyncInvoker(DeleteHostRequest request) {
        return new AsyncInvoker<>(request, WafMeta.deleteHost, hcClient);
    }

    /**
     * 删除全局白名单(原误报屏蔽)防护规则
     *
     * 删除全局白名单(原误报屏蔽)防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIgnoreRuleRequest 请求对象
     * @return CompletableFuture<DeleteIgnoreRuleResponse>
     */
    public CompletableFuture<DeleteIgnoreRuleResponse> deleteIgnoreRuleAsync(DeleteIgnoreRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteIgnoreRule);
    }

    /**
     * 删除全局白名单(原误报屏蔽)防护规则
     *
     * 删除全局白名单(原误报屏蔽)防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIgnoreRuleRequest 请求对象
     * @return AsyncInvoker<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse>
     */
    public AsyncInvoker<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse> deleteIgnoreRuleAsyncInvoker(
        DeleteIgnoreRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.deleteIgnoreRule, hcClient);
    }

    /**
     * 删除WAF独享引擎信息
     *
     * 删除WAF独享引擎信息。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteInstance);
    }

    /**
     * 删除WAF独享引擎信息
     *
     * 删除WAF独享引擎信息。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<>(request, WafMeta.deleteInstance, hcClient);
    }

    /**
     * 删除ip地址组
     *
     * 删除ip地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpGroupRequest 请求对象
     * @return CompletableFuture<DeleteIpGroupResponse>
     */
    public CompletableFuture<DeleteIpGroupResponse> deleteIpGroupAsync(DeleteIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteIpGroup);
    }

    /**
     * 删除ip地址组
     *
     * 删除ip地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpGroupRequest 请求对象
     * @return AsyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse>
     */
    public AsyncInvoker<DeleteIpGroupRequest, DeleteIpGroupResponse> deleteIpGroupAsyncInvoker(
        DeleteIpGroupRequest request) {
        return new AsyncInvoker<>(request, WafMeta.deleteIpGroup, hcClient);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略，若策略正在使用，则需要先接解除域名与策略的绑定关系才能删除策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return CompletableFuture<DeletePolicyResponse>
     */
    public CompletableFuture<DeletePolicyResponse> deletePolicyAsync(DeletePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deletePolicy);
    }

    /**
     * 删除防护策略
     *
     * 删除防护策略，若策略正在使用，则需要先接解除域名与策略的绑定关系才能删除策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyAsyncInvoker(
        DeletePolicyRequest request) {
        return new AsyncInvoker<>(request, WafMeta.deletePolicy, hcClient);
    }

    /**
     * 删除独享模式域名
     *
     * 删除独享模式域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePremiumHostRequest 请求对象
     * @return CompletableFuture<DeletePremiumHostResponse>
     */
    public CompletableFuture<DeletePremiumHostResponse> deletePremiumHostAsync(DeletePremiumHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deletePremiumHost);
    }

    /**
     * 删除独享模式域名
     *
     * 删除独享模式域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePremiumHostRequest 请求对象
     * @return AsyncInvoker<DeletePremiumHostRequest, DeletePremiumHostResponse>
     */
    public AsyncInvoker<DeletePremiumHostRequest, DeletePremiumHostResponse> deletePremiumHostAsyncInvoker(
        DeletePremiumHostRequest request) {
        return new AsyncInvoker<>(request, WafMeta.deletePremiumHost, hcClient);
    }

    /**
     * 删除隐私屏蔽防护规则
     *
     * 删除隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePrivacyRuleRequest 请求对象
     * @return CompletableFuture<DeletePrivacyRuleResponse>
     */
    public CompletableFuture<DeletePrivacyRuleResponse> deletePrivacyRuleAsync(DeletePrivacyRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deletePrivacyRule);
    }

    /**
     * 删除隐私屏蔽防护规则
     *
     * 删除隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePrivacyRuleRequest 请求对象
     * @return AsyncInvoker<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse>
     */
    public AsyncInvoker<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse> deletePrivacyRuleAsyncInvoker(
        DeletePrivacyRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.deletePrivacyRule, hcClient);
    }

    /**
     * 删除攻击惩罚规则
     *
     * 删除攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePunishmentRuleRequest 请求对象
     * @return CompletableFuture<DeletePunishmentRuleResponse>
     */
    public CompletableFuture<DeletePunishmentRuleResponse> deletePunishmentRuleAsync(
        DeletePunishmentRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deletePunishmentRule);
    }

    /**
     * 删除攻击惩罚规则
     *
     * 删除攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePunishmentRuleRequest 请求对象
     * @return AsyncInvoker<DeletePunishmentRuleRequest, DeletePunishmentRuleResponse>
     */
    public AsyncInvoker<DeletePunishmentRuleRequest, DeletePunishmentRuleResponse> deletePunishmentRuleAsyncInvoker(
        DeletePunishmentRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.deletePunishmentRule, hcClient);
    }

    /**
     * 删除引用表
     *
     * 删除引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteValueListRequest 请求对象
     * @return CompletableFuture<DeleteValueListResponse>
     */
    public CompletableFuture<DeleteValueListResponse> deleteValueListAsync(DeleteValueListRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteValueList);
    }

    /**
     * 删除引用表
     *
     * 删除引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteValueListRequest 请求对象
     * @return AsyncInvoker<DeleteValueListRequest, DeleteValueListResponse>
     */
    public AsyncInvoker<DeleteValueListRequest, DeleteValueListResponse> deleteValueListAsyncInvoker(
        DeleteValueListRequest request) {
        return new AsyncInvoker<>(request, WafMeta.deleteValueList, hcClient);
    }

    /**
     * 删除黑白名单防护规则
     *
     * 删除黑白名单防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWhiteBlackIpRuleRequest 请求对象
     * @return CompletableFuture<DeleteWhiteBlackIpRuleResponse>
     */
    public CompletableFuture<DeleteWhiteBlackIpRuleResponse> deleteWhiteBlackIpRuleAsync(
        DeleteWhiteBlackIpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.deleteWhiteBlackIpRule);
    }

    /**
     * 删除黑白名单防护规则
     *
     * 删除黑白名单防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWhiteBlackIpRuleRequest 请求对象
     * @return AsyncInvoker<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse>
     */
    public AsyncInvoker<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse> deleteWhiteBlackIpRuleAsyncInvoker(
        DeleteWhiteBlackIpRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.deleteWhiteBlackIpRule, hcClient);
    }

    /**
     * 查询所有策略网页防篡改
     *
     * 查询所有策略网页防篡改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiTamperPolicyRulesRequest 请求对象
     * @return CompletableFuture<ListAntiTamperPolicyRulesResponse>
     */
    public CompletableFuture<ListAntiTamperPolicyRulesResponse> listAntiTamperPolicyRulesAsync(
        ListAntiTamperPolicyRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listAntiTamperPolicyRules);
    }

    /**
     * 查询所有策略网页防篡改
     *
     * 查询所有策略网页防篡改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntiTamperPolicyRulesRequest 请求对象
     * @return AsyncInvoker<ListAntiTamperPolicyRulesRequest, ListAntiTamperPolicyRulesResponse>
     */
    public AsyncInvoker<ListAntiTamperPolicyRulesRequest, ListAntiTamperPolicyRulesResponse> listAntiTamperPolicyRulesAsyncInvoker(
        ListAntiTamperPolicyRulesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listAntiTamperPolicyRules, hcClient);
    }

    /**
     * 查询JS脚本反爬虫规则列表
     *
     * 查询JS脚本反爬虫规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAnticrawlerRulesRequest 请求对象
     * @return CompletableFuture<ListAnticrawlerRulesResponse>
     */
    public CompletableFuture<ListAnticrawlerRulesResponse> listAnticrawlerRulesAsync(
        ListAnticrawlerRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listAnticrawlerRules);
    }

    /**
     * 查询JS脚本反爬虫规则列表
     *
     * 查询JS脚本反爬虫规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAnticrawlerRulesRequest 请求对象
     * @return AsyncInvoker<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse>
     */
    public AsyncInvoker<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse> listAnticrawlerRulesAsyncInvoker(
        ListAnticrawlerRulesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listAnticrawlerRules, hcClient);
    }

    /**
     * 查询所有策略防敏感信息泄露规则
     *
     * 查询所有策略防敏感信息泄露规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntileakagePolicyRulesRequest 请求对象
     * @return CompletableFuture<ListAntileakagePolicyRulesResponse>
     */
    public CompletableFuture<ListAntileakagePolicyRulesResponse> listAntileakagePolicyRulesAsync(
        ListAntileakagePolicyRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listAntileakagePolicyRules);
    }

    /**
     * 查询所有策略防敏感信息泄露规则
     *
     * 查询所有策略防敏感信息泄露规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntileakagePolicyRulesRequest 请求对象
     * @return AsyncInvoker<ListAntileakagePolicyRulesRequest, ListAntileakagePolicyRulesResponse>
     */
    public AsyncInvoker<ListAntileakagePolicyRulesRequest, ListAntileakagePolicyRulesResponse> listAntileakagePolicyRulesAsyncInvoker(
        ListAntileakagePolicyRulesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listAntileakagePolicyRules, hcClient);
    }

    /**
     * 查询防敏感信息泄露规则列表
     *
     * 查询防敏感信息泄露规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntileakageRulesRequest 请求对象
     * @return CompletableFuture<ListAntileakageRulesResponse>
     */
    public CompletableFuture<ListAntileakageRulesResponse> listAntileakageRulesAsync(
        ListAntileakageRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listAntileakageRules);
    }

    /**
     * 查询防敏感信息泄露规则列表
     *
     * 查询防敏感信息泄露规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntileakageRulesRequest 请求对象
     * @return AsyncInvoker<ListAntileakageRulesRequest, ListAntileakageRulesResponse>
     */
    public AsyncInvoker<ListAntileakageRulesRequest, ListAntileakageRulesResponse> listAntileakageRulesAsyncInvoker(
        ListAntileakageRulesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listAntileakageRules, hcClient);
    }

    /**
     * 查询防篡改规则列表
     *
     * 查询防篡改规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntitamperRuleRequest 请求对象
     * @return CompletableFuture<ListAntitamperRuleResponse>
     */
    public CompletableFuture<ListAntitamperRuleResponse> listAntitamperRuleAsync(ListAntitamperRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listAntitamperRule);
    }

    /**
     * 查询防篡改规则列表
     *
     * 查询防篡改规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAntitamperRuleRequest 请求对象
     * @return AsyncInvoker<ListAntitamperRuleRequest, ListAntitamperRuleResponse>
     */
    public AsyncInvoker<ListAntitamperRuleRequest, ListAntitamperRuleResponse> listAntitamperRuleAsyncInvoker(
        ListAntitamperRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listAntitamperRule, hcClient);
    }

    /**
     * 查询攻击防护类型
     *
     * 查询攻击防护类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttackActionTypesRequest 请求对象
     * @return CompletableFuture<ListAttackActionTypesResponse>
     */
    public CompletableFuture<ListAttackActionTypesResponse> listAttackActionTypesAsync(
        ListAttackActionTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listAttackActionTypes);
    }

    /**
     * 查询攻击防护类型
     *
     * 查询攻击防护类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttackActionTypesRequest 请求对象
     * @return AsyncInvoker<ListAttackActionTypesRequest, ListAttackActionTypesResponse>
     */
    public AsyncInvoker<ListAttackActionTypesRequest, ListAttackActionTypesResponse> listAttackActionTypesAsyncInvoker(
        ListAttackActionTypesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listAttackActionTypes, hcClient);
    }

    /**
     * 查询安全统计带宽数据
     *
     * 查询安全统计带宽数据，统计的带宽数据为平均值，单位为bit/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthTimelineRequest 请求对象
     * @return CompletableFuture<ListBandwidthTimelineResponse>
     */
    public CompletableFuture<ListBandwidthTimelineResponse> listBandwidthTimelineAsync(
        ListBandwidthTimelineRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listBandwidthTimeline);
    }

    /**
     * 查询安全统计带宽数据
     *
     * 查询安全统计带宽数据，统计的带宽数据为平均值，单位为bit/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBandwidthTimelineRequest 请求对象
     * @return AsyncInvoker<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse>
     */
    public AsyncInvoker<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse> listBandwidthTimelineAsyncInvoker(
        ListBandwidthTimelineRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listBandwidthTimeline, hcClient);
    }

    /**
     * 查询所有策略CC规则
     *
     * 查询所有策略CC规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCcPolicyRulesRequest 请求对象
     * @return CompletableFuture<ListCcPolicyRulesResponse>
     */
    public CompletableFuture<ListCcPolicyRulesResponse> listCcPolicyRulesAsync(ListCcPolicyRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listCcPolicyRules);
    }

    /**
     * 查询所有策略CC规则
     *
     * 查询所有策略CC规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCcPolicyRulesRequest 请求对象
     * @return AsyncInvoker<ListCcPolicyRulesRequest, ListCcPolicyRulesResponse>
     */
    public AsyncInvoker<ListCcPolicyRulesRequest, ListCcPolicyRulesResponse> listCcPolicyRulesAsyncInvoker(
        ListCcPolicyRulesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listCcPolicyRules, hcClient);
    }

    /**
     * 查询cc规则列表
     *
     * 查询cc规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCcRulesRequest 请求对象
     * @return CompletableFuture<ListCcRulesResponse>
     */
    public CompletableFuture<ListCcRulesResponse> listCcRulesAsync(ListCcRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listCcRules);
    }

    /**
     * 查询cc规则列表
     *
     * 查询cc规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCcRulesRequest 请求对象
     * @return AsyncInvoker<ListCcRulesRequest, ListCcRulesResponse>
     */
    public AsyncInvoker<ListCcRulesRequest, ListCcRulesResponse> listCcRulesAsyncInvoker(ListCcRulesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listCcRules, hcClient);
    }

    /**
     * 查询证书列表
     *
     * 查询证书列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificatesRequest 请求对象
     * @return CompletableFuture<ListCertificatesResponse>
     */
    public CompletableFuture<ListCertificatesResponse> listCertificatesAsync(ListCertificatesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listCertificates);
    }

    /**
     * 查询证书列表
     *
     * 查询证书列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCertificatesRequest 请求对象
     * @return AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse>
     */
    public AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesAsyncInvoker(
        ListCertificatesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listCertificates, hcClient);
    }

    /**
     * 查询全部防护域名列表
     *
     * 查询全部防护域名列表，包括云模式和独享模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCompositeHostsRequest 请求对象
     * @return CompletableFuture<ListCompositeHostsResponse>
     */
    public CompletableFuture<ListCompositeHostsResponse> listCompositeHostsAsync(ListCompositeHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listCompositeHosts);
    }

    /**
     * 查询全部防护域名列表
     *
     * 查询全部防护域名列表，包括云模式和独享模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCompositeHostsRequest 请求对象
     * @return AsyncInvoker<ListCompositeHostsRequest, ListCompositeHostsResponse>
     */
    public AsyncInvoker<ListCompositeHostsRequest, ListCompositeHostsResponse> listCompositeHostsAsyncInvoker(
        ListCompositeHostsRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listCompositeHosts, hcClient);
    }

    /**
     * 查询所有策略精准防护规则
     *
     * 查询所有策略精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomPolicyRulesRequest 请求对象
     * @return CompletableFuture<ListCustomPolicyRulesResponse>
     */
    public CompletableFuture<ListCustomPolicyRulesResponse> listCustomPolicyRulesAsync(
        ListCustomPolicyRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listCustomPolicyRules);
    }

    /**
     * 查询所有策略精准防护规则
     *
     * 查询所有策略精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomPolicyRulesRequest 请求对象
     * @return AsyncInvoker<ListCustomPolicyRulesRequest, ListCustomPolicyRulesResponse>
     */
    public AsyncInvoker<ListCustomPolicyRulesRequest, ListCustomPolicyRulesResponse> listCustomPolicyRulesAsyncInvoker(
        ListCustomPolicyRulesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listCustomPolicyRules, hcClient);
    }

    /**
     * 查询精准防护规则列表
     *
     * 查询精准防护规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomRulesRequest 请求对象
     * @return CompletableFuture<ListCustomRulesResponse>
     */
    public CompletableFuture<ListCustomRulesResponse> listCustomRulesAsync(ListCustomRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listCustomRules);
    }

    /**
     * 查询精准防护规则列表
     *
     * 查询精准防护规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomRulesRequest 请求对象
     * @return AsyncInvoker<ListCustomRulesRequest, ListCustomRulesResponse>
     */
    public AsyncInvoker<ListCustomRulesRequest, ListCustomRulesResponse> listCustomRulesAsyncInvoker(
        ListCustomRulesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listCustomRules, hcClient);
    }

    /**
     * 查询攻击事件列表
     *
     * 查询攻击事件列表，该API暂时不支持查询全部防护事件，pagesize参数不可设为-1，由于性能原因，数据量越大消耗的内存越大，后端最多限制查询10000条数据，例如：自定义时间段内的数据超过了10000条，就无法查出page为101，pagesize为100之后的数据，需要调整时间区间，再进行查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventRequest 请求对象
     * @return CompletableFuture<ListEventResponse>
     */
    public CompletableFuture<ListEventResponse> listEventAsync(ListEventRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listEvent);
    }

    /**
     * 查询攻击事件列表
     *
     * 查询攻击事件列表，该API暂时不支持查询全部防护事件，pagesize参数不可设为-1，由于性能原因，数据量越大消耗的内存越大，后端最多限制查询10000条数据，例如：自定义时间段内的数据超过了10000条，就无法查出page为101，pagesize为100之后的数据，需要调整时间区间，再进行查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventRequest 请求对象
     * @return AsyncInvoker<ListEventRequest, ListEventResponse>
     */
    public AsyncInvoker<ListEventRequest, ListEventResponse> listEventAsyncInvoker(ListEventRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listEvent, hcClient);
    }

    /**
     * 查询事件日志下载的url
     *
     * 查询事件日志下载的url
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventLogRequest 请求对象
     * @return CompletableFuture<ListEventLogResponse>
     */
    public CompletableFuture<ListEventLogResponse> listEventLogAsync(ListEventLogRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listEventLog);
    }

    /**
     * 查询事件日志下载的url
     *
     * 查询事件日志下载的url
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEventLogRequest 请求对象
     * @return AsyncInvoker<ListEventLogRequest, ListEventLogResponse>
     */
    public AsyncInvoker<ListEventLogRequest, ListEventLogResponse> listEventLogAsyncInvoker(
        ListEventLogRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listEventLog, hcClient);
    }

    /**
     * 查询所有策略地理位置访问控制
     *
     * 查询所有策略地理位置访问控制
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeoIpPolicyRulesRequest 请求对象
     * @return CompletableFuture<ListGeoIpPolicyRulesResponse>
     */
    public CompletableFuture<ListGeoIpPolicyRulesResponse> listGeoIpPolicyRulesAsync(
        ListGeoIpPolicyRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listGeoIpPolicyRules);
    }

    /**
     * 查询所有策略地理位置访问控制
     *
     * 查询所有策略地理位置访问控制
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeoIpPolicyRulesRequest 请求对象
     * @return AsyncInvoker<ListGeoIpPolicyRulesRequest, ListGeoIpPolicyRulesResponse>
     */
    public AsyncInvoker<ListGeoIpPolicyRulesRequest, ListGeoIpPolicyRulesResponse> listGeoIpPolicyRulesAsyncInvoker(
        ListGeoIpPolicyRulesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listGeoIpPolicyRules, hcClient);
    }

    /**
     * 查询地理位置访问控制规则列表
     *
     * 查询地理位置访问控制规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeoipRuleRequest 请求对象
     * @return CompletableFuture<ListGeoipRuleResponse>
     */
    public CompletableFuture<ListGeoipRuleResponse> listGeoipRuleAsync(ListGeoipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listGeoipRule);
    }

    /**
     * 查询地理位置访问控制规则列表
     *
     * 查询地理位置访问控制规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeoipRuleRequest 请求对象
     * @return AsyncInvoker<ListGeoipRuleRequest, ListGeoipRuleResponse>
     */
    public AsyncInvoker<ListGeoipRuleRequest, ListGeoipRuleResponse> listGeoipRuleAsyncInvoker(
        ListGeoipRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listGeoipRule, hcClient);
    }

    /**
     * 查询云模式防护域名列表
     *
     * 查询云模式防护域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostRequest 请求对象
     * @return CompletableFuture<ListHostResponse>
     */
    public CompletableFuture<ListHostResponse> listHostAsync(ListHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listHost);
    }

    /**
     * 查询云模式防护域名列表
     *
     * 查询云模式防护域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostRequest 请求对象
     * @return AsyncInvoker<ListHostRequest, ListHostResponse>
     */
    public AsyncInvoker<ListHostRequest, ListHostResponse> listHostAsyncInvoker(ListHostRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listHost, hcClient);
    }

    /**
     * 获取云模式域名路由信息
     *
     * 返回路由信息。 &gt; 该API局点受限使用，后续将下线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostRouteRequest 请求对象
     * @return CompletableFuture<ListHostRouteResponse>
     */
    public CompletableFuture<ListHostRouteResponse> listHostRouteAsync(ListHostRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listHostRoute);
    }

    /**
     * 获取云模式域名路由信息
     *
     * 返回路由信息。 &gt; 该API局点受限使用，后续将下线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHostRouteRequest 请求对象
     * @return AsyncInvoker<ListHostRouteRequest, ListHostRouteResponse>
     */
    public AsyncInvoker<ListHostRouteRequest, ListHostRouteResponse> listHostRouteAsyncInvoker(
        ListHostRouteRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listHostRoute, hcClient);
    }

    /**
     * 查询所有策略全局白名单
     *
     * 查询所有策略全局白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIgnorePolicyRulesRequest 请求对象
     * @return CompletableFuture<ListIgnorePolicyRulesResponse>
     */
    public CompletableFuture<ListIgnorePolicyRulesResponse> listIgnorePolicyRulesAsync(
        ListIgnorePolicyRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listIgnorePolicyRules);
    }

    /**
     * 查询所有策略全局白名单
     *
     * 查询所有策略全局白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIgnorePolicyRulesRequest 请求对象
     * @return AsyncInvoker<ListIgnorePolicyRulesRequest, ListIgnorePolicyRulesResponse>
     */
    public AsyncInvoker<ListIgnorePolicyRulesRequest, ListIgnorePolicyRulesResponse> listIgnorePolicyRulesAsyncInvoker(
        ListIgnorePolicyRulesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listIgnorePolicyRules, hcClient);
    }

    /**
     * 查询全局白名单(原误报屏蔽)规则列表
     *
     * 查询全局白名单(原误报屏蔽)规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIgnoreRuleRequest 请求对象
     * @return CompletableFuture<ListIgnoreRuleResponse>
     */
    public CompletableFuture<ListIgnoreRuleResponse> listIgnoreRuleAsync(ListIgnoreRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listIgnoreRule);
    }

    /**
     * 查询全局白名单(原误报屏蔽)规则列表
     *
     * 查询全局白名单(原误报屏蔽)规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIgnoreRuleRequest 请求对象
     * @return AsyncInvoker<ListIgnoreRuleRequest, ListIgnoreRuleResponse>
     */
    public AsyncInvoker<ListIgnoreRuleRequest, ListIgnoreRuleResponse> listIgnoreRuleAsyncInvoker(
        ListIgnoreRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listIgnoreRule, hcClient);
    }

    /**
     * 查询WAF独享引擎列表
     *
     * 查询WAF独享引擎列表。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRequest 请求对象
     * @return CompletableFuture<ListInstanceResponse>
     */
    public CompletableFuture<ListInstanceResponse> listInstanceAsync(ListInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listInstance);
    }

    /**
     * 查询WAF独享引擎列表
     *
     * 查询WAF独享引擎列表。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceRequest 请求对象
     * @return AsyncInvoker<ListInstanceRequest, ListInstanceResponse>
     */
    public AsyncInvoker<ListInstanceRequest, ListInstanceResponse> listInstanceAsyncInvoker(
        ListInstanceRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listInstance, hcClient);
    }

    /**
     * 查询WAF独享引擎标签
     *
     * 查询WAF独享引擎标签。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return CompletableFuture<ListInstanceTagsResponse>
     */
    public CompletableFuture<ListInstanceTagsResponse> listInstanceTagsAsync(ListInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listInstanceTags);
    }

    /**
     * 查询WAF独享引擎标签
     *
     * 查询WAF独享引擎标签。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsAsyncInvoker(
        ListInstanceTagsRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listInstanceTags, hcClient);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpGroupRequest 请求对象
     * @return CompletableFuture<ListIpGroupResponse>
     */
    public CompletableFuture<ListIpGroupResponse> listIpGroupAsync(ListIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listIpGroup);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpGroupRequest 请求对象
     * @return AsyncInvoker<ListIpGroupRequest, ListIpGroupResponse>
     */
    public AsyncInvoker<ListIpGroupRequest, ListIpGroupResponse> listIpGroupAsyncInvoker(ListIpGroupRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listIpGroup, hcClient);
    }

    /**
     * 查询所有策略威胁情报控制规则
     *
     * 查询所有策略威胁情报控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpReputationPolicyRulesRequest 请求对象
     * @return CompletableFuture<ListIpReputationPolicyRulesResponse>
     */
    public CompletableFuture<ListIpReputationPolicyRulesResponse> listIpReputationPolicyRulesAsync(
        ListIpReputationPolicyRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listIpReputationPolicyRules);
    }

    /**
     * 查询所有策略威胁情报控制规则
     *
     * 查询所有策略威胁情报控制规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpReputationPolicyRulesRequest 请求对象
     * @return AsyncInvoker<ListIpReputationPolicyRulesRequest, ListIpReputationPolicyRulesResponse>
     */
    public AsyncInvoker<ListIpReputationPolicyRulesRequest, ListIpReputationPolicyRulesResponse> listIpReputationPolicyRulesAsyncInvoker(
        ListIpReputationPolicyRulesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listIpReputationPolicyRules, hcClient);
    }

    /**
     * 查询威胁情报规则列表
     *
     * 查询威胁情报规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpReputationRulesRequest 请求对象
     * @return CompletableFuture<ListIpReputationRulesResponse>
     */
    public CompletableFuture<ListIpReputationRulesResponse> listIpReputationRulesAsync(
        ListIpReputationRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listIpReputationRules);
    }

    /**
     * 查询威胁情报规则列表
     *
     * 查询威胁情报规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpReputationRulesRequest 请求对象
     * @return AsyncInvoker<ListIpReputationRulesRequest, ListIpReputationRulesResponse>
     */
    public AsyncInvoker<ListIpReputationRulesRequest, ListIpReputationRulesResponse> listIpReputationRulesAsyncInvoker(
        ListIpReputationRulesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listIpReputationRules, hcClient);
    }

    /**
     * 查询告警通知配置
     *
     * 查询告警通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNoticeConfigsRequest 请求对象
     * @return CompletableFuture<ListNoticeConfigsResponse>
     */
    public CompletableFuture<ListNoticeConfigsResponse> listNoticeConfigsAsync(ListNoticeConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listNoticeConfigs);
    }

    /**
     * 查询告警通知配置
     *
     * 查询告警通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNoticeConfigsRequest 请求对象
     * @return AsyncInvoker<ListNoticeConfigsRequest, ListNoticeConfigsResponse>
     */
    public AsyncInvoker<ListNoticeConfigsRequest, ListNoticeConfigsResponse> listNoticeConfigsAsyncInvoker(
        ListNoticeConfigsRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listNoticeConfigs, hcClient);
    }

    /**
     * 查询安全总览分类统计top信息
     *
     * 查询安全总览分类统计TOP信息，包含受攻击域名 、攻击源ip、受攻击URL、攻击来源区域、攻击事件分布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOverviewsClassificationRequest 请求对象
     * @return CompletableFuture<ListOverviewsClassificationResponse>
     */
    public CompletableFuture<ListOverviewsClassificationResponse> listOverviewsClassificationAsync(
        ListOverviewsClassificationRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listOverviewsClassification);
    }

    /**
     * 查询安全总览分类统计top信息
     *
     * 查询安全总览分类统计TOP信息，包含受攻击域名 、攻击源ip、受攻击URL、攻击来源区域、攻击事件分布。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOverviewsClassificationRequest 请求对象
     * @return AsyncInvoker<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse>
     */
    public AsyncInvoker<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse> listOverviewsClassificationAsyncInvoker(
        ListOverviewsClassificationRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listOverviewsClassification, hcClient);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyRequest 请求对象
     * @return CompletableFuture<ListPolicyResponse>
     */
    public CompletableFuture<ListPolicyResponse> listPolicyAsync(ListPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listPolicy);
    }

    /**
     * 查询防护策略列表
     *
     * 查询防护策略列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyRequest 请求对象
     * @return AsyncInvoker<ListPolicyRequest, ListPolicyResponse>
     */
    public AsyncInvoker<ListPolicyRequest, ListPolicyResponse> listPolicyAsyncInvoker(ListPolicyRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listPolicy, hcClient);
    }

    /**
     * 独享模式域名列表
     *
     * 独享模式域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPremiumHostRequest 请求对象
     * @return CompletableFuture<ListPremiumHostResponse>
     */
    public CompletableFuture<ListPremiumHostResponse> listPremiumHostAsync(ListPremiumHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listPremiumHost);
    }

    /**
     * 独享模式域名列表
     *
     * 独享模式域名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPremiumHostRequest 请求对象
     * @return AsyncInvoker<ListPremiumHostRequest, ListPremiumHostResponse>
     */
    public AsyncInvoker<ListPremiumHostRequest, ListPremiumHostResponse> listPremiumHostAsyncInvoker(
        ListPremiumHostRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listPremiumHost, hcClient);
    }

    /**
     * 查询所有策略隐私屏蔽防护规则
     *
     * 查询所有策略隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivacyPolicyRulesRequest 请求对象
     * @return CompletableFuture<ListPrivacyPolicyRulesResponse>
     */
    public CompletableFuture<ListPrivacyPolicyRulesResponse> listPrivacyPolicyRulesAsync(
        ListPrivacyPolicyRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listPrivacyPolicyRules);
    }

    /**
     * 查询所有策略隐私屏蔽防护规则
     *
     * 查询所有策略隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivacyPolicyRulesRequest 请求对象
     * @return AsyncInvoker<ListPrivacyPolicyRulesRequest, ListPrivacyPolicyRulesResponse>
     */
    public AsyncInvoker<ListPrivacyPolicyRulesRequest, ListPrivacyPolicyRulesResponse> listPrivacyPolicyRulesAsyncInvoker(
        ListPrivacyPolicyRulesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listPrivacyPolicyRules, hcClient);
    }

    /**
     * 查询隐私屏蔽防护规则列表
     *
     * 查询隐私屏蔽防护规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivacyRuleRequest 请求对象
     * @return CompletableFuture<ListPrivacyRuleResponse>
     */
    public CompletableFuture<ListPrivacyRuleResponse> listPrivacyRuleAsync(ListPrivacyRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listPrivacyRule);
    }

    /**
     * 查询隐私屏蔽防护规则列表
     *
     * 查询隐私屏蔽防护规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivacyRuleRequest 请求对象
     * @return AsyncInvoker<ListPrivacyRuleRequest, ListPrivacyRuleResponse>
     */
    public AsyncInvoker<ListPrivacyRuleRequest, ListPrivacyRuleResponse> listPrivacyRuleAsyncInvoker(
        ListPrivacyRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listPrivacyRule, hcClient);
    }

    /**
     * 查询可防护的资源列表
     *
     * 查询可防护的资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectableResourcesRequest 请求对象
     * @return CompletableFuture<ListProtectableResourcesResponse>
     */
    public CompletableFuture<ListProtectableResourcesResponse> listProtectableResourcesAsync(
        ListProtectableResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listProtectableResources);
    }

    /**
     * 查询可防护的资源列表
     *
     * 查询可防护的资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectableResourcesRequest 请求对象
     * @return AsyncInvoker<ListProtectableResourcesRequest, ListProtectableResourcesResponse>
     */
    public AsyncInvoker<ListProtectableResourcesRequest, ListProtectableResourcesResponse> listProtectableResourcesAsyncInvoker(
        ListProtectableResourcesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listProtectableResources, hcClient);
    }

    /**
     * 查询攻击惩罚规则列表
     *
     * 查询攻击惩罚规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPunishmentRulesRequest 请求对象
     * @return CompletableFuture<ListPunishmentRulesResponse>
     */
    public CompletableFuture<ListPunishmentRulesResponse> listPunishmentRulesAsync(ListPunishmentRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listPunishmentRules);
    }

    /**
     * 查询攻击惩罚规则列表
     *
     * 查询攻击惩罚规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPunishmentRulesRequest 请求对象
     * @return AsyncInvoker<ListPunishmentRulesRequest, ListPunishmentRulesResponse>
     */
    public AsyncInvoker<ListPunishmentRulesRequest, ListPunishmentRulesResponse> listPunishmentRulesAsyncInvoker(
        ListPunishmentRulesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listPunishmentRules, hcClient);
    }

    /**
     * 查询安全统计qps次数
     *
     * 查询安全统计qps次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQpsTimelineRequest 请求对象
     * @return CompletableFuture<ListQpsTimelineResponse>
     */
    public CompletableFuture<ListQpsTimelineResponse> listQpsTimelineAsync(ListQpsTimelineRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listQpsTimeline);
    }

    /**
     * 查询安全统计qps次数
     *
     * 查询安全统计qps次数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQpsTimelineRequest 请求对象
     * @return AsyncInvoker<ListQpsTimelineRequest, ListQpsTimelineResponse>
     */
    public AsyncInvoker<ListQpsTimelineRequest, ListQpsTimelineResponse> listQpsTimelineAsyncInvoker(
        ListQpsTimelineRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listQpsTimeline, hcClient);
    }

    /**
     * 查询安全总览中请求次数时间线统计数据
     *
     * 查询安全总览中请求次数时间线统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRequestTimelineRequest 请求对象
     * @return CompletableFuture<ListRequestTimelineResponse>
     */
    public CompletableFuture<ListRequestTimelineResponse> listRequestTimelineAsync(ListRequestTimelineRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listRequestTimeline);
    }

    /**
     * 查询安全总览中请求次数时间线统计数据
     *
     * 查询安全总览中请求次数时间线统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRequestTimelineRequest 请求对象
     * @return AsyncInvoker<ListRequestTimelineRequest, ListRequestTimelineResponse>
     */
    public AsyncInvoker<ListRequestTimelineRequest, ListRequestTimelineResponse> listRequestTimelineAsyncInvoker(
        ListRequestTimelineRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listRequestTimeline, hcClient);
    }

    /**
     * 查询安全统计响应码数据
     *
     * 查询安全统计响应码数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResponseCodeTimelineRequest 请求对象
     * @return CompletableFuture<ListResponseCodeTimelineResponse>
     */
    public CompletableFuture<ListResponseCodeTimelineResponse> listResponseCodeTimelineAsync(
        ListResponseCodeTimelineRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listResponseCodeTimeline);
    }

    /**
     * 查询安全统计响应码数据
     *
     * 查询安全统计响应码数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResponseCodeTimelineRequest 请求对象
     * @return AsyncInvoker<ListResponseCodeTimelineRequest, ListResponseCodeTimelineResponse>
     */
    public AsyncInvoker<ListResponseCodeTimelineRequest, ListResponseCodeTimelineResponse> listResponseCodeTimelineAsyncInvoker(
        ListResponseCodeTimelineRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listResponseCodeTimeline, hcClient);
    }

    /**
     * 查询安全报告历史统计周期列表
     *
     * 查询安全报告历史统计周期列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityReportHistoryPeriodsRequest 请求对象
     * @return CompletableFuture<ListSecurityReportHistoryPeriodsResponse>
     */
    public CompletableFuture<ListSecurityReportHistoryPeriodsResponse> listSecurityReportHistoryPeriodsAsync(
        ListSecurityReportHistoryPeriodsRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listSecurityReportHistoryPeriods);
    }

    /**
     * 查询安全报告历史统计周期列表
     *
     * 查询安全报告历史统计周期列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityReportHistoryPeriodsRequest 请求对象
     * @return AsyncInvoker<ListSecurityReportHistoryPeriodsRequest, ListSecurityReportHistoryPeriodsResponse>
     */
    public AsyncInvoker<ListSecurityReportHistoryPeriodsRequest, ListSecurityReportHistoryPeriodsResponse> listSecurityReportHistoryPeriodsAsyncInvoker(
        ListSecurityReportHistoryPeriodsRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listSecurityReportHistoryPeriods, hcClient);
    }

    /**
     * 查询安全报告发送记录
     *
     * 查询安全报告发送记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityReportSendingRecordsRequest 请求对象
     * @return CompletableFuture<ListSecurityReportSendingRecordsResponse>
     */
    public CompletableFuture<ListSecurityReportSendingRecordsResponse> listSecurityReportSendingRecordsAsync(
        ListSecurityReportSendingRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listSecurityReportSendingRecords);
    }

    /**
     * 查询安全报告发送记录
     *
     * 查询安全报告发送记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityReportSendingRecordsRequest 请求对象
     * @return AsyncInvoker<ListSecurityReportSendingRecordsRequest, ListSecurityReportSendingRecordsResponse>
     */
    public AsyncInvoker<ListSecurityReportSendingRecordsRequest, ListSecurityReportSendingRecordsResponse> listSecurityReportSendingRecordsAsyncInvoker(
        ListSecurityReportSendingRecordsRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listSecurityReportSendingRecords, hcClient);
    }

    /**
     * 查询安全报告订阅列表
     *
     * 查询安全报告订阅列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityReportSubscriptionsRequest 请求对象
     * @return CompletableFuture<ListSecurityReportSubscriptionsResponse>
     */
    public CompletableFuture<ListSecurityReportSubscriptionsResponse> listSecurityReportSubscriptionsAsync(
        ListSecurityReportSubscriptionsRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listSecurityReportSubscriptions);
    }

    /**
     * 查询安全报告订阅列表
     *
     * 查询安全报告订阅列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityReportSubscriptionsRequest 请求对象
     * @return AsyncInvoker<ListSecurityReportSubscriptionsRequest, ListSecurityReportSubscriptionsResponse>
     */
    public AsyncInvoker<ListSecurityReportSubscriptionsRequest, ListSecurityReportSubscriptionsResponse> listSecurityReportSubscriptionsAsyncInvoker(
        ListSecurityReportSubscriptionsRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listSecurityReportSubscriptions, hcClient);
    }

    /**
     * 查询安全总览请求与攻击数量
     *
     * 查询安全总览请求与攻击数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStatisticsRequest 请求对象
     * @return CompletableFuture<ListStatisticsResponse>
     */
    public CompletableFuture<ListStatisticsResponse> listStatisticsAsync(ListStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listStatistics);
    }

    /**
     * 查询安全总览请求与攻击数量
     *
     * 查询安全总览请求与攻击数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStatisticsRequest 请求对象
     * @return AsyncInvoker<ListStatisticsRequest, ListStatisticsResponse>
     */
    public AsyncInvoker<ListStatisticsRequest, ListStatisticsResponse> listStatisticsAsyncInvoker(
        ListStatisticsRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listStatistics, hcClient);
    }

    /**
     * 查询业务异常数量
     *
     * 查询业务异常TOP统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopAbnormalRequest 请求对象
     * @return CompletableFuture<ListTopAbnormalResponse>
     */
    public CompletableFuture<ListTopAbnormalResponse> listTopAbnormalAsync(ListTopAbnormalRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listTopAbnormal);
    }

    /**
     * 查询业务异常数量
     *
     * 查询业务异常TOP统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopAbnormalRequest 请求对象
     * @return AsyncInvoker<ListTopAbnormalRequest, ListTopAbnormalResponse>
     */
    public AsyncInvoker<ListTopAbnormalRequest, ListTopAbnormalResponse> listTopAbnormalAsyncInvoker(
        ListTopAbnormalRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listTopAbnormal, hcClient);
    }

    /**
     * 查询top受攻击域名
     *
     * 查询top受攻击域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopDomainsRequest 请求对象
     * @return CompletableFuture<ListTopDomainsResponse>
     */
    public CompletableFuture<ListTopDomainsResponse> listTopDomainsAsync(ListTopDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listTopDomains);
    }

    /**
     * 查询top受攻击域名
     *
     * 查询top受攻击域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopDomainsRequest 请求对象
     * @return AsyncInvoker<ListTopDomainsRequest, ListTopDomainsResponse>
     */
    public AsyncInvoker<ListTopDomainsRequest, ListTopDomainsResponse> listTopDomainsAsyncInvoker(
        ListTopDomainsRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listTopDomains, hcClient);
    }

    /**
     * 查询攻击源ip
     *
     * 查询攻击源ip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopIpRequest 请求对象
     * @return CompletableFuture<ListTopIpResponse>
     */
    public CompletableFuture<ListTopIpResponse> listTopIpAsync(ListTopIpRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listTopIp);
    }

    /**
     * 查询攻击源ip
     *
     * 查询攻击源ip
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopIpRequest 请求对象
     * @return AsyncInvoker<ListTopIpRequest, ListTopIpResponse>
     */
    public AsyncInvoker<ListTopIpRequest, ListTopIpResponse> listTopIpAsyncInvoker(ListTopIpRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listTopIp, hcClient);
    }

    /**
     * 查询被攻击url
     *
     * 查询被攻击url
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopUrlRequest 请求对象
     * @return CompletableFuture<ListTopUrlResponse>
     */
    public CompletableFuture<ListTopUrlResponse> listTopUrlAsync(ListTopUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listTopUrl);
    }

    /**
     * 查询被攻击url
     *
     * 查询被攻击url
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopUrlRequest 请求对象
     * @return AsyncInvoker<ListTopUrlRequest, ListTopUrlResponse>
     */
    public AsyncInvoker<ListTopUrlRequest, ListTopUrlResponse> listTopUrlAsyncInvoker(ListTopUrlRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listTopUrl, hcClient);
    }

    /**
     * 查询引用表列表
     *
     * 查询引用表列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListValueListRequest 请求对象
     * @return CompletableFuture<ListValueListResponse>
     */
    public CompletableFuture<ListValueListResponse> listValueListAsync(ListValueListRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listValueList);
    }

    /**
     * 查询引用表列表
     *
     * 查询引用表列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListValueListRequest 请求对象
     * @return AsyncInvoker<ListValueListRequest, ListValueListResponse>
     */
    public AsyncInvoker<ListValueListRequest, ListValueListResponse> listValueListAsyncInvoker(
        ListValueListRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listValueList, hcClient);
    }

    /**
     * 查询web基础防护内置规则列表
     *
     * 查询web基础防护内置规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebBasicProtectionRulesRequest 请求对象
     * @return CompletableFuture<ListWebBasicProtectionRulesResponse>
     */
    public CompletableFuture<ListWebBasicProtectionRulesResponse> listWebBasicProtectionRulesAsync(
        ListWebBasicProtectionRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listWebBasicProtectionRules);
    }

    /**
     * 查询web基础防护内置规则列表
     *
     * 查询web基础防护内置规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWebBasicProtectionRulesRequest 请求对象
     * @return AsyncInvoker<ListWebBasicProtectionRulesRequest, ListWebBasicProtectionRulesResponse>
     */
    public AsyncInvoker<ListWebBasicProtectionRulesRequest, ListWebBasicProtectionRulesResponse> listWebBasicProtectionRulesAsyncInvoker(
        ListWebBasicProtectionRulesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listWebBasicProtectionRules, hcClient);
    }

    /**
     * 查询所有策略黑白名单防护规则
     *
     * 查询所有策略黑白名单防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWhiteblackipPolicyRulesRequest 请求对象
     * @return CompletableFuture<ListWhiteblackipPolicyRulesResponse>
     */
    public CompletableFuture<ListWhiteblackipPolicyRulesResponse> listWhiteblackipPolicyRulesAsync(
        ListWhiteblackipPolicyRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listWhiteblackipPolicyRules);
    }

    /**
     * 查询所有策略黑白名单防护规则
     *
     * 查询所有策略黑白名单防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWhiteblackipPolicyRulesRequest 请求对象
     * @return AsyncInvoker<ListWhiteblackipPolicyRulesRequest, ListWhiteblackipPolicyRulesResponse>
     */
    public AsyncInvoker<ListWhiteblackipPolicyRulesRequest, ListWhiteblackipPolicyRulesResponse> listWhiteblackipPolicyRulesAsyncInvoker(
        ListWhiteblackipPolicyRulesRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listWhiteblackipPolicyRules, hcClient);
    }

    /**
     * 查询黑白名单规则列表
     *
     * 查询黑白名单规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWhiteblackipRuleRequest 请求对象
     * @return CompletableFuture<ListWhiteblackipRuleResponse>
     */
    public CompletableFuture<ListWhiteblackipRuleResponse> listWhiteblackipRuleAsync(
        ListWhiteblackipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.listWhiteblackipRule);
    }

    /**
     * 查询黑白名单规则列表
     *
     * 查询黑白名单规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWhiteblackipRuleRequest 请求对象
     * @return AsyncInvoker<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse>
     */
    public AsyncInvoker<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse> listWhiteblackipRuleAsyncInvoker(
        ListWhiteblackipRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.listWhiteblackipRule, hcClient);
    }

    /**
     * 按企业项目迁移防护域名
     *
     * 按企业项目迁移防护域名，仅专业版与独享版支持该功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateCompositeHostsRequest 请求对象
     * @return CompletableFuture<MigrateCompositeHostsResponse>
     */
    public CompletableFuture<MigrateCompositeHostsResponse> migrateCompositeHostsAsync(
        MigrateCompositeHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.migrateCompositeHosts);
    }

    /**
     * 按企业项目迁移防护域名
     *
     * 按企业项目迁移防护域名，仅专业版与独享版支持该功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateCompositeHostsRequest 请求对象
     * @return AsyncInvoker<MigrateCompositeHostsRequest, MigrateCompositeHostsResponse>
     */
    public AsyncInvoker<MigrateCompositeHostsRequest, MigrateCompositeHostsResponse> migrateCompositeHostsAsyncInvoker(
        MigrateCompositeHostsRequest request) {
        return new AsyncInvoker<>(request, WafMeta.migrateCompositeHosts, hcClient);
    }

    /**
     * 重命名WAF独享引擎
     *
     * 重命名WAF独享引擎。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenameInstanceRequest 请求对象
     * @return CompletableFuture<RenameInstanceResponse>
     */
    public CompletableFuture<RenameInstanceResponse> renameInstanceAsync(RenameInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.renameInstance);
    }

    /**
     * 重命名WAF独享引擎
     *
     * 重命名WAF独享引擎。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenameInstanceRequest 请求对象
     * @return AsyncInvoker<RenameInstanceRequest, RenameInstanceResponse>
     */
    public AsyncInvoker<RenameInstanceRequest, RenameInstanceResponse> renameInstanceAsyncInvoker(
        RenameInstanceRequest request) {
        return new AsyncInvoker<>(request, WafMeta.renameInstance, hcClient);
    }

    /**
     * 查询JS脚本反爬虫防护规则
     *
     * 根据Id查询JS脚本反爬虫防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAnticrawlerRuleRequest 请求对象
     * @return CompletableFuture<ShowAnticrawlerRuleResponse>
     */
    public CompletableFuture<ShowAnticrawlerRuleResponse> showAnticrawlerRuleAsync(ShowAnticrawlerRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showAnticrawlerRule);
    }

    /**
     * 查询JS脚本反爬虫防护规则
     *
     * 根据Id查询JS脚本反爬虫防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAnticrawlerRuleRequest 请求对象
     * @return AsyncInvoker<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse>
     */
    public AsyncInvoker<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse> showAnticrawlerRuleAsyncInvoker(
        ShowAnticrawlerRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showAnticrawlerRule, hcClient);
    }

    /**
     * 查询防敏感信息泄露防护规则
     *
     * 根据Id查询防敏感信息泄露防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntileakageRuleRequest 请求对象
     * @return CompletableFuture<ShowAntileakageRuleResponse>
     */
    public CompletableFuture<ShowAntileakageRuleResponse> showAntileakageRuleAsync(ShowAntileakageRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showAntileakageRule);
    }

    /**
     * 查询防敏感信息泄露防护规则
     *
     * 根据Id查询防敏感信息泄露防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntileakageRuleRequest 请求对象
     * @return AsyncInvoker<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse>
     */
    public AsyncInvoker<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse> showAntileakageRuleAsyncInvoker(
        ShowAntileakageRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showAntileakageRule, hcClient);
    }

    /**
     * 查询防篡改防护规则
     *
     * 查询防篡改防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntitamperRuleRequest 请求对象
     * @return CompletableFuture<ShowAntitamperRuleResponse>
     */
    public CompletableFuture<ShowAntitamperRuleResponse> showAntitamperRuleAsync(ShowAntitamperRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showAntitamperRule);
    }

    /**
     * 查询防篡改防护规则
     *
     * 查询防篡改防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAntitamperRuleRequest 请求对象
     * @return AsyncInvoker<ShowAntitamperRuleRequest, ShowAntitamperRuleResponse>
     */
    public AsyncInvoker<ShowAntitamperRuleRequest, ShowAntitamperRuleResponse> showAntitamperRuleAsyncInvoker(
        ShowAntitamperRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showAntitamperRule, hcClient);
    }

    /**
     * 根据Id查询cc防护规则
     *
     * 根据Id查询cc防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCcRuleRequest 请求对象
     * @return CompletableFuture<ShowCcRuleResponse>
     */
    public CompletableFuture<ShowCcRuleResponse> showCcRuleAsync(ShowCcRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showCcRule);
    }

    /**
     * 根据Id查询cc防护规则
     *
     * 根据Id查询cc防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCcRuleRequest 请求对象
     * @return AsyncInvoker<ShowCcRuleRequest, ShowCcRuleResponse>
     */
    public AsyncInvoker<ShowCcRuleRequest, ShowCcRuleResponse> showCcRuleAsyncInvoker(ShowCcRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showCcRule, hcClient);
    }

    /**
     * 查询证书
     *
     * 查询证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateRequest 请求对象
     * @return CompletableFuture<ShowCertificateResponse>
     */
    public CompletableFuture<ShowCertificateResponse> showCertificateAsync(ShowCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showCertificate);
    }

    /**
     * 查询证书
     *
     * 查询证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificateRequest 请求对象
     * @return AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse>
     */
    public AsyncInvoker<ShowCertificateRequest, ShowCertificateResponse> showCertificateAsyncInvoker(
        ShowCertificateRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showCertificate, hcClient);
    }

    /**
     * 根据Id查询防护域名
     *
     * 根据Id查询防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompositeHostRequest 请求对象
     * @return CompletableFuture<ShowCompositeHostResponse>
     */
    public CompletableFuture<ShowCompositeHostResponse> showCompositeHostAsync(ShowCompositeHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showCompositeHost);
    }

    /**
     * 根据Id查询防护域名
     *
     * 根据Id查询防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompositeHostRequest 请求对象
     * @return AsyncInvoker<ShowCompositeHostRequest, ShowCompositeHostResponse>
     */
    public AsyncInvoker<ShowCompositeHostRequest, ShowCompositeHostResponse> showCompositeHostAsyncInvoker(
        ShowCompositeHostRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showCompositeHost, hcClient);
    }

    /**
     * 局点支持特性查询
     *
     * 局点支持特性查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsoleConfigRequest 请求对象
     * @return CompletableFuture<ShowConsoleConfigResponse>
     */
    public CompletableFuture<ShowConsoleConfigResponse> showConsoleConfigAsync(ShowConsoleConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showConsoleConfig);
    }

    /**
     * 局点支持特性查询
     *
     * 局点支持特性查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConsoleConfigRequest 请求对象
     * @return AsyncInvoker<ShowConsoleConfigRequest, ShowConsoleConfigResponse>
     */
    public AsyncInvoker<ShowConsoleConfigRequest, ShowConsoleConfigResponse> showConsoleConfigAsyncInvoker(
        ShowConsoleConfigRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showConsoleConfig, hcClient);
    }

    /**
     * 根据Id查询精准防护规则
     *
     * 根据Id查询精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCustomRuleRequest 请求对象
     * @return CompletableFuture<ShowCustomRuleResponse>
     */
    public CompletableFuture<ShowCustomRuleResponse> showCustomRuleAsync(ShowCustomRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showCustomRule);
    }

    /**
     * 根据Id查询精准防护规则
     *
     * 根据Id查询精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCustomRuleRequest 请求对象
     * @return AsyncInvoker<ShowCustomRuleRequest, ShowCustomRuleResponse>
     */
    public AsyncInvoker<ShowCustomRuleRequest, ShowCustomRuleResponse> showCustomRuleAsyncInvoker(
        ShowCustomRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showCustomRule, hcClient);
    }

    /**
     * 查询指定事件id的防护事件详情
     *
     * 查询指定事件id的防护事件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventRequest 请求对象
     * @return CompletableFuture<ShowEventResponse>
     */
    public CompletableFuture<ShowEventResponse> showEventAsync(ShowEventRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showEvent);
    }

    /**
     * 查询指定事件id的防护事件详情
     *
     * 查询指定事件id的防护事件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEventRequest 请求对象
     * @return AsyncInvoker<ShowEventRequest, ShowEventResponse>
     */
    public AsyncInvoker<ShowEventRequest, ShowEventResponse> showEventAsyncInvoker(ShowEventRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showEvent, hcClient);
    }

    /**
     * 查询地理位置控制防护规则详情
     *
     * 查询地理位置控制防护规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGeoipRuleRequest 请求对象
     * @return CompletableFuture<ShowGeoipRuleResponse>
     */
    public CompletableFuture<ShowGeoipRuleResponse> showGeoipRuleAsync(ShowGeoipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showGeoipRule);
    }

    /**
     * 查询地理位置控制防护规则详情
     *
     * 查询地理位置控制防护规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGeoipRuleRequest 请求对象
     * @return AsyncInvoker<ShowGeoipRuleRequest, ShowGeoipRuleResponse>
     */
    public AsyncInvoker<ShowGeoipRuleRequest, ShowGeoipRuleResponse> showGeoipRuleAsyncInvoker(
        ShowGeoipRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showGeoipRule, hcClient);
    }

    /**
     * 根据防护域名Id查询云模式防护域名详细信息
     *
     * 根据防护域名Id查询云模式防护域名详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostRequest 请求对象
     * @return CompletableFuture<ShowHostResponse>
     */
    public CompletableFuture<ShowHostResponse> showHostAsync(ShowHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showHost);
    }

    /**
     * 根据防护域名Id查询云模式防护域名详细信息
     *
     * 根据防护域名Id查询云模式防护域名详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostRequest 请求对象
     * @return AsyncInvoker<ShowHostRequest, ShowHostResponse>
     */
    public AsyncInvoker<ShowHostRequest, ShowHostResponse> showHostAsyncInvoker(ShowHostRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showHost, hcClient);
    }

    /**
     * 查询域名运行状态
     *
     * 查询域名运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostStatusRequest 请求对象
     * @return CompletableFuture<ShowHostStatusResponse>
     */
    public CompletableFuture<ShowHostStatusResponse> showHostStatusAsync(ShowHostStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showHostStatus);
    }

    /**
     * 查询域名运行状态
     *
     * 查询域名运行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHostStatusRequest 请求对象
     * @return AsyncInvoker<ShowHostStatusRequest, ShowHostStatusResponse>
     */
    public AsyncInvoker<ShowHostStatusRequest, ShowHostStatusResponse> showHostStatusAsyncInvoker(
        ShowHostStatusRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showHostStatus, hcClient);
    }

    /**
     * 查询全局白名单(原误报屏蔽)防护规则
     *
     * 查询全局白名单(原误报屏蔽)防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIgnoreRuleRequest 请求对象
     * @return CompletableFuture<ShowIgnoreRuleResponse>
     */
    public CompletableFuture<ShowIgnoreRuleResponse> showIgnoreRuleAsync(ShowIgnoreRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showIgnoreRule);
    }

    /**
     * 查询全局白名单(原误报屏蔽)防护规则
     *
     * 查询全局白名单(原误报屏蔽)防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIgnoreRuleRequest 请求对象
     * @return AsyncInvoker<ShowIgnoreRuleRequest, ShowIgnoreRuleResponse>
     */
    public AsyncInvoker<ShowIgnoreRuleRequest, ShowIgnoreRuleResponse> showIgnoreRuleAsyncInvoker(
        ShowIgnoreRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showIgnoreRule, hcClient);
    }

    /**
     * 查询WAF独享引擎信息
     *
     * 查询WAF独享引擎信息。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return CompletableFuture<ShowInstanceResponse>
     */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showInstance);
    }

    /**
     * 查询WAF独享引擎信息
     *
     * 查询WAF独享引擎信息。独享模式只在部分局点支持，包括：华北-北京四、华东-上海一、华南-广州、华南-深圳  、中国-香港、亚太-曼谷、 亚太-新加坡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceAsyncInvoker(
        ShowInstanceRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showInstance, hcClient);
    }

    /**
     * 查询ip地址组明细
     *
     * 查询ip地址组明细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpGroupRequest 请求对象
     * @return CompletableFuture<ShowIpGroupResponse>
     */
    public CompletableFuture<ShowIpGroupResponse> showIpGroupAsync(ShowIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showIpGroup);
    }

    /**
     * 查询ip地址组明细
     *
     * 查询ip地址组明细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpGroupRequest 请求对象
     * @return AsyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse>
     */
    public AsyncInvoker<ShowIpGroupRequest, ShowIpGroupResponse> showIpGroupAsyncInvoker(ShowIpGroupRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showIpGroup, hcClient);
    }

    /**
     * 查询lts配置信息
     *
     * 查询lts配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLtsInfoConfigRequest 请求对象
     * @return CompletableFuture<ShowLtsInfoConfigResponse>
     */
    public CompletableFuture<ShowLtsInfoConfigResponse> showLtsInfoConfigAsync(ShowLtsInfoConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showLtsInfoConfig);
    }

    /**
     * 查询lts配置信息
     *
     * 查询lts配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLtsInfoConfigRequest 请求对象
     * @return AsyncInvoker<ShowLtsInfoConfigRequest, ShowLtsInfoConfigResponse>
     */
    public AsyncInvoker<ShowLtsInfoConfigRequest, ShowLtsInfoConfigResponse> showLtsInfoConfigAsyncInvoker(
        ShowLtsInfoConfigRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showLtsInfoConfig, hcClient);
    }

    /**
     * 根据Id查询防护策略
     *
     * 根据Id查询防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyRequest 请求对象
     * @return CompletableFuture<ShowPolicyResponse>
     */
    public CompletableFuture<ShowPolicyResponse> showPolicyAsync(ShowPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showPolicy);
    }

    /**
     * 根据Id查询防护策略
     *
     * 根据Id查询防护策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyRequest 请求对象
     * @return AsyncInvoker<ShowPolicyRequest, ShowPolicyResponse>
     */
    public AsyncInvoker<ShowPolicyRequest, ShowPolicyResponse> showPolicyAsyncInvoker(ShowPolicyRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showPolicy, hcClient);
    }

    /**
     * 查询地理位置选项的详细信息
     *
     * 查询地理位置选项的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyGeoipMapRequest 请求对象
     * @return CompletableFuture<ShowPolicyGeoipMapResponse>
     */
    public CompletableFuture<ShowPolicyGeoipMapResponse> showPolicyGeoipMapAsync(ShowPolicyGeoipMapRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showPolicyGeoipMap);
    }

    /**
     * 查询地理位置选项的详细信息
     *
     * 查询地理位置选项的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyGeoipMapRequest 请求对象
     * @return AsyncInvoker<ShowPolicyGeoipMapRequest, ShowPolicyGeoipMapResponse>
     */
    public AsyncInvoker<ShowPolicyGeoipMapRequest, ShowPolicyGeoipMapResponse> showPolicyGeoipMapAsyncInvoker(
        ShowPolicyGeoipMapRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showPolicyGeoipMap, hcClient);
    }

    /**
     * 查看独享模式域名配置
     *
     * 查看独享模式域名配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPremiumHostRequest 请求对象
     * @return CompletableFuture<ShowPremiumHostResponse>
     */
    public CompletableFuture<ShowPremiumHostResponse> showPremiumHostAsync(ShowPremiumHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showPremiumHost);
    }

    /**
     * 查看独享模式域名配置
     *
     * 查看独享模式域名配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPremiumHostRequest 请求对象
     * @return AsyncInvoker<ShowPremiumHostRequest, ShowPremiumHostResponse>
     */
    public AsyncInvoker<ShowPremiumHostRequest, ShowPremiumHostResponse> showPremiumHostAsyncInvoker(
        ShowPremiumHostRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showPremiumHost, hcClient);
    }

    /**
     * 查询隐私屏蔽防护规则
     *
     * 查询隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivacyRuleRequest 请求对象
     * @return CompletableFuture<ShowPrivacyRuleResponse>
     */
    public CompletableFuture<ShowPrivacyRuleResponse> showPrivacyRuleAsync(ShowPrivacyRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showPrivacyRule);
    }

    /**
     * 查询隐私屏蔽防护规则
     *
     * 查询隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivacyRuleRequest 请求对象
     * @return AsyncInvoker<ShowPrivacyRuleRequest, ShowPrivacyRuleResponse>
     */
    public AsyncInvoker<ShowPrivacyRuleRequest, ShowPrivacyRuleResponse> showPrivacyRuleAsyncInvoker(
        ShowPrivacyRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showPrivacyRule, hcClient);
    }

    /**
     * 根据Id查询攻击惩罚防护规则
     *
     * 根据Id查询攻击惩罚防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPunishmentRuleRequest 请求对象
     * @return CompletableFuture<ShowPunishmentRuleResponse>
     */
    public CompletableFuture<ShowPunishmentRuleResponse> showPunishmentRuleAsync(ShowPunishmentRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showPunishmentRule);
    }

    /**
     * 根据Id查询攻击惩罚防护规则
     *
     * 根据Id查询攻击惩罚防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPunishmentRuleRequest 请求对象
     * @return AsyncInvoker<ShowPunishmentRuleRequest, ShowPunishmentRuleResponse>
     */
    public AsyncInvoker<ShowPunishmentRuleRequest, ShowPunishmentRuleResponse> showPunishmentRuleAsyncInvoker(
        ShowPunishmentRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showPunishmentRule, hcClient);
    }

    /**
     * 查询安全报告内容
     *
     * 查询安全报告内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityReportContentRequest 请求对象
     * @return CompletableFuture<ShowSecurityReportContentResponse>
     */
    public CompletableFuture<ShowSecurityReportContentResponse> showSecurityReportContentAsync(
        ShowSecurityReportContentRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showSecurityReportContent);
    }

    /**
     * 查询安全报告内容
     *
     * 查询安全报告内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityReportContentRequest 请求对象
     * @return AsyncInvoker<ShowSecurityReportContentRequest, ShowSecurityReportContentResponse>
     */
    public AsyncInvoker<ShowSecurityReportContentRequest, ShowSecurityReportContentResponse> showSecurityReportContentAsyncInvoker(
        ShowSecurityReportContentRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showSecurityReportContent, hcClient);
    }

    /**
     * 查询安全报告订阅
     *
     * 查询安全报告订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityReportSubscriptionRequest 请求对象
     * @return CompletableFuture<ShowSecurityReportSubscriptionResponse>
     */
    public CompletableFuture<ShowSecurityReportSubscriptionResponse> showSecurityReportSubscriptionAsync(
        ShowSecurityReportSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showSecurityReportSubscription);
    }

    /**
     * 查询安全报告订阅
     *
     * 查询安全报告订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityReportSubscriptionRequest 请求对象
     * @return AsyncInvoker<ShowSecurityReportSubscriptionRequest, ShowSecurityReportSubscriptionResponse>
     */
    public AsyncInvoker<ShowSecurityReportSubscriptionRequest, ShowSecurityReportSubscriptionResponse> showSecurityReportSubscriptionAsyncInvoker(
        ShowSecurityReportSubscriptionRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showSecurityReportSubscription, hcClient);
    }

    /**
     * 查询WAF回源Ip信息
     *
     * 查询WAF回源Ip信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSourceIpRequest 请求对象
     * @return CompletableFuture<ShowSourceIpResponse>
     */
    public CompletableFuture<ShowSourceIpResponse> showSourceIpAsync(ShowSourceIpRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showSourceIp);
    }

    /**
     * 查询WAF回源Ip信息
     *
     * 查询WAF回源Ip信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSourceIpRequest 请求对象
     * @return AsyncInvoker<ShowSourceIpRequest, ShowSourceIpResponse>
     */
    public AsyncInvoker<ShowSourceIpRequest, ShowSourceIpResponse> showSourceIpAsyncInvoker(
        ShowSourceIpRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showSourceIp, hcClient);
    }

    /**
     * 查询租户订购信息
     *
     * 查询租户订购信息，包括云模式包周期、按需计费、独享模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubscriptionInfoRequest 请求对象
     * @return CompletableFuture<ShowSubscriptionInfoResponse>
     */
    public CompletableFuture<ShowSubscriptionInfoResponse> showSubscriptionInfoAsync(
        ShowSubscriptionInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showSubscriptionInfo);
    }

    /**
     * 查询租户订购信息
     *
     * 查询租户订购信息，包括云模式包周期、按需计费、独享模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubscriptionInfoRequest 请求对象
     * @return AsyncInvoker<ShowSubscriptionInfoRequest, ShowSubscriptionInfoResponse>
     */
    public AsyncInvoker<ShowSubscriptionInfoRequest, ShowSubscriptionInfoResponse> showSubscriptionInfoAsyncInvoker(
        ShowSubscriptionInfoRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showSubscriptionInfo, hcClient);
    }

    /**
     * 查询引用表
     *
     * 查询引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowValueListRequest 请求对象
     * @return CompletableFuture<ShowValueListResponse>
     */
    public CompletableFuture<ShowValueListResponse> showValueListAsync(ShowValueListRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showValueList);
    }

    /**
     * 查询引用表
     *
     * 查询引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowValueListRequest 请求对象
     * @return AsyncInvoker<ShowValueListRequest, ShowValueListResponse>
     */
    public AsyncInvoker<ShowValueListRequest, ShowValueListResponse> showValueListAsyncInvoker(
        ShowValueListRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showValueList, hcClient);
    }

    /**
     * 查询黑白名单防护规则
     *
     * 查询黑白名单防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWhiteBlackIpRuleRequest 请求对象
     * @return CompletableFuture<ShowWhiteBlackIpRuleResponse>
     */
    public CompletableFuture<ShowWhiteBlackIpRuleResponse> showWhiteBlackIpRuleAsync(
        ShowWhiteBlackIpRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showWhiteBlackIpRule);
    }

    /**
     * 查询黑白名单防护规则
     *
     * 查询黑白名单防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWhiteBlackIpRuleRequest 请求对象
     * @return AsyncInvoker<ShowWhiteBlackIpRuleRequest, ShowWhiteBlackIpRuleResponse>
     */
    public AsyncInvoker<ShowWhiteBlackIpRuleRequest, ShowWhiteBlackIpRuleResponse> showWhiteBlackIpRuleAsyncInvoker(
        ShowWhiteBlackIpRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showWhiteBlackIpRule, hcClient);
    }

    /**
     * 修改域名接入进度
     *
     * 返回接入进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessProgressRequest 请求对象
     * @return CompletableFuture<UpdateAccessProgressResponse>
     */
    public CompletableFuture<UpdateAccessProgressResponse> updateAccessProgressAsync(
        UpdateAccessProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateAccessProgress);
    }

    /**
     * 修改域名接入进度
     *
     * 返回接入进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccessProgressRequest 请求对象
     * @return AsyncInvoker<UpdateAccessProgressRequest, UpdateAccessProgressResponse>
     */
    public AsyncInvoker<UpdateAccessProgressRequest, UpdateAccessProgressResponse> updateAccessProgressAsyncInvoker(
        UpdateAccessProgressRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updateAccessProgress, hcClient);
    }

    /**
     * 更新告警通知配置
     *
     * 更新告警通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlertNoticeConfigRequest 请求对象
     * @return CompletableFuture<UpdateAlertNoticeConfigResponse>
     */
    public CompletableFuture<UpdateAlertNoticeConfigResponse> updateAlertNoticeConfigAsync(
        UpdateAlertNoticeConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateAlertNoticeConfig);
    }

    /**
     * 更新告警通知配置
     *
     * 更新告警通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAlertNoticeConfigRequest 请求对象
     * @return AsyncInvoker<UpdateAlertNoticeConfigRequest, UpdateAlertNoticeConfigResponse>
     */
    public AsyncInvoker<UpdateAlertNoticeConfigRequest, UpdateAlertNoticeConfigResponse> updateAlertNoticeConfigAsyncInvoker(
        UpdateAlertNoticeConfigRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updateAlertNoticeConfig, hcClient);
    }

    /**
     * 网页防篡改规则更新缓存
     *
     * 网页防篡改规则更新缓存
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAntiTamperRuleRefreshRequest 请求对象
     * @return CompletableFuture<UpdateAntiTamperRuleRefreshResponse>
     */
    public CompletableFuture<UpdateAntiTamperRuleRefreshResponse> updateAntiTamperRuleRefreshAsync(
        UpdateAntiTamperRuleRefreshRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateAntiTamperRuleRefresh);
    }

    /**
     * 网页防篡改规则更新缓存
     *
     * 网页防篡改规则更新缓存
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAntiTamperRuleRefreshRequest 请求对象
     * @return AsyncInvoker<UpdateAntiTamperRuleRefreshRequest, UpdateAntiTamperRuleRefreshResponse>
     */
    public AsyncInvoker<UpdateAntiTamperRuleRefreshRequest, UpdateAntiTamperRuleRefreshResponse> updateAntiTamperRuleRefreshAsyncInvoker(
        UpdateAntiTamperRuleRefreshRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updateAntiTamperRuleRefresh, hcClient);
    }

    /**
     * 更新JS脚本反爬虫防护规则
     *
     * 更新JS脚本反爬虫防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAnticrawlerRuleRequest 请求对象
     * @return CompletableFuture<UpdateAnticrawlerRuleResponse>
     */
    public CompletableFuture<UpdateAnticrawlerRuleResponse> updateAnticrawlerRuleAsync(
        UpdateAnticrawlerRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateAnticrawlerRule);
    }

    /**
     * 更新JS脚本反爬虫防护规则
     *
     * 更新JS脚本反爬虫防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAnticrawlerRuleRequest 请求对象
     * @return AsyncInvoker<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse>
     */
    public AsyncInvoker<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse> updateAnticrawlerRuleAsyncInvoker(
        UpdateAnticrawlerRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updateAnticrawlerRule, hcClient);
    }

    /**
     * 更新JS脚本反爬虫规则防护模式
     *
     * 更新JS脚本反爬虫规则防护模式，在创建JS脚本反爬虫规则前，需要调用该接口指定JS脚本反爬虫规则防护模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAnticrawlerRuleTypeRequest 请求对象
     * @return CompletableFuture<UpdateAnticrawlerRuleTypeResponse>
     */
    public CompletableFuture<UpdateAnticrawlerRuleTypeResponse> updateAnticrawlerRuleTypeAsync(
        UpdateAnticrawlerRuleTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateAnticrawlerRuleType);
    }

    /**
     * 更新JS脚本反爬虫规则防护模式
     *
     * 更新JS脚本反爬虫规则防护模式，在创建JS脚本反爬虫规则前，需要调用该接口指定JS脚本反爬虫规则防护模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAnticrawlerRuleTypeRequest 请求对象
     * @return AsyncInvoker<UpdateAnticrawlerRuleTypeRequest, UpdateAnticrawlerRuleTypeResponse>
     */
    public AsyncInvoker<UpdateAnticrawlerRuleTypeRequest, UpdateAnticrawlerRuleTypeResponse> updateAnticrawlerRuleTypeAsyncInvoker(
        UpdateAnticrawlerRuleTypeRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updateAnticrawlerRuleType, hcClient);
    }

    /**
     * 更新防敏感信息泄露防护规则
     *
     * 更新防敏感信息泄露防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAntileakageRuleRequest 请求对象
     * @return CompletableFuture<UpdateAntileakageRuleResponse>
     */
    public CompletableFuture<UpdateAntileakageRuleResponse> updateAntileakageRuleAsync(
        UpdateAntileakageRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateAntileakageRule);
    }

    /**
     * 更新防敏感信息泄露防护规则
     *
     * 更新防敏感信息泄露防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAntileakageRuleRequest 请求对象
     * @return AsyncInvoker<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse>
     */
    public AsyncInvoker<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse> updateAntileakageRuleAsyncInvoker(
        UpdateAntileakageRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updateAntileakageRule, hcClient);
    }

    /**
     * 更新cc防护规则
     *
     * 更新cc防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCcRuleRequest 请求对象
     * @return CompletableFuture<UpdateCcRuleResponse>
     */
    public CompletableFuture<UpdateCcRuleResponse> updateCcRuleAsync(UpdateCcRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateCcRule);
    }

    /**
     * 更新cc防护规则
     *
     * 更新cc防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCcRuleRequest 请求对象
     * @return AsyncInvoker<UpdateCcRuleRequest, UpdateCcRuleResponse>
     */
    public AsyncInvoker<UpdateCcRuleRequest, UpdateCcRuleResponse> updateCcRuleAsyncInvoker(
        UpdateCcRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updateCcRule, hcClient);
    }

    /**
     * 修改证书
     *
     * 修改证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCertificateRequest 请求对象
     * @return CompletableFuture<UpdateCertificateResponse>
     */
    public CompletableFuture<UpdateCertificateResponse> updateCertificateAsync(UpdateCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateCertificate);
    }

    /**
     * 修改证书
     *
     * 修改证书
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCertificateRequest 请求对象
     * @return AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse>
     */
    public AsyncInvoker<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificateAsyncInvoker(
        UpdateCertificateRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updateCertificate, hcClient);
    }

    /**
     * 更新精准防护规则
     *
     * 更新精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCustomRuleRequest 请求对象
     * @return CompletableFuture<UpdateCustomRuleResponse>
     */
    public CompletableFuture<UpdateCustomRuleResponse> updateCustomRuleAsync(UpdateCustomRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateCustomRule);
    }

    /**
     * 更新精准防护规则
     *
     * 更新精准防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCustomRuleRequest 请求对象
     * @return AsyncInvoker<UpdateCustomRuleRequest, UpdateCustomRuleResponse>
     */
    public AsyncInvoker<UpdateCustomRuleRequest, UpdateCustomRuleResponse> updateCustomRuleAsyncInvoker(
        UpdateCustomRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updateCustomRule, hcClient);
    }

    /**
     * 更新地理位置控制防护规则
     *
     * 更新地理位置控制防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGeoipRuleRequest 请求对象
     * @return CompletableFuture<UpdateGeoipRuleResponse>
     */
    public CompletableFuture<UpdateGeoipRuleResponse> updateGeoipRuleAsync(UpdateGeoipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateGeoipRule);
    }

    /**
     * 更新地理位置控制防护规则
     *
     * 更新地理位置控制防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGeoipRuleRequest 请求对象
     * @return AsyncInvoker<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse>
     */
    public AsyncInvoker<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> updateGeoipRuleAsyncInvoker(
        UpdateGeoipRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updateGeoipRule, hcClient);
    }

    /**
     * 更新云模式防护域名的配置
     *
     * 更新云模式防护域名配置，在没有填入源站信息server的原始数据的情况下，则新的源站信息server会覆盖源站信息，而不是新增源站。此外，请求体可只传需要更新的部分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostRequest 请求对象
     * @return CompletableFuture<UpdateHostResponse>
     */
    public CompletableFuture<UpdateHostResponse> updateHostAsync(UpdateHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateHost);
    }

    /**
     * 更新云模式防护域名的配置
     *
     * 更新云模式防护域名配置，在没有填入源站信息server的原始数据的情况下，则新的源站信息server会覆盖源站信息，而不是新增源站。此外，请求体可只传需要更新的部分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostRequest 请求对象
     * @return AsyncInvoker<UpdateHostRequest, UpdateHostResponse>
     */
    public AsyncInvoker<UpdateHostRequest, UpdateHostResponse> updateHostAsyncInvoker(UpdateHostRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updateHost, hcClient);
    }

    /**
     * 修改域名接入状态
     *
     * 返回接入状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostAccessStatusOfUnderlineRequest 请求对象
     * @return CompletableFuture<UpdateHostAccessStatusOfUnderlineResponse>
     */
    public CompletableFuture<UpdateHostAccessStatusOfUnderlineResponse> updateHostAccessStatusOfUnderlineAsync(
        UpdateHostAccessStatusOfUnderlineRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateHostAccessStatusOfUnderline);
    }

    /**
     * 修改域名接入状态
     *
     * 返回接入状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostAccessStatusOfUnderlineRequest 请求对象
     * @return AsyncInvoker<UpdateHostAccessStatusOfUnderlineRequest, UpdateHostAccessStatusOfUnderlineResponse>
     */
    public AsyncInvoker<UpdateHostAccessStatusOfUnderlineRequest, UpdateHostAccessStatusOfUnderlineResponse> updateHostAccessStatusOfUnderlineAsyncInvoker(
        UpdateHostAccessStatusOfUnderlineRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updateHostAccessStatusOfUnderline, hcClient);
    }

    /**
     * 修改域名防护状态
     *
     * 修改域名防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostProtectStatusRequest 请求对象
     * @return CompletableFuture<UpdateHostProtectStatusResponse>
     */
    public CompletableFuture<UpdateHostProtectStatusResponse> updateHostProtectStatusAsync(
        UpdateHostProtectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateHostProtectStatus);
    }

    /**
     * 修改域名防护状态
     *
     * 修改域名防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostProtectStatusRequest 请求对象
     * @return AsyncInvoker<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse>
     */
    public AsyncInvoker<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse> updateHostProtectStatusAsyncInvoker(
        UpdateHostProtectStatusRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updateHostProtectStatus, hcClient);
    }

    /**
     * 更新全局白名单(原误报屏蔽)防护规则
     *
     * 更新全局白名单(原误报屏蔽)防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIgnoreRuleRequest 请求对象
     * @return CompletableFuture<UpdateIgnoreRuleResponse>
     */
    public CompletableFuture<UpdateIgnoreRuleResponse> updateIgnoreRuleAsync(UpdateIgnoreRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateIgnoreRule);
    }

    /**
     * 更新全局白名单(原误报屏蔽)防护规则
     *
     * 更新全局白名单(原误报屏蔽)防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIgnoreRuleRequest 请求对象
     * @return AsyncInvoker<UpdateIgnoreRuleRequest, UpdateIgnoreRuleResponse>
     */
    public AsyncInvoker<UpdateIgnoreRuleRequest, UpdateIgnoreRuleResponse> updateIgnoreRuleAsyncInvoker(
        UpdateIgnoreRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updateIgnoreRule, hcClient);
    }

    /**
     * 修改云模式域名路由信息
     *
     * 更新云模式域名路由信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRouteRequest 请求对象
     * @return CompletableFuture<UpdateInstanceRouteResponse>
     */
    public CompletableFuture<UpdateInstanceRouteResponse> updateInstanceRouteAsync(UpdateInstanceRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateInstanceRoute);
    }

    /**
     * 修改云模式域名路由信息
     *
     * 更新云模式域名路由信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRouteRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRouteRequest, UpdateInstanceRouteResponse>
     */
    public AsyncInvoker<UpdateInstanceRouteRequest, UpdateInstanceRouteResponse> updateInstanceRouteAsyncInvoker(
        UpdateInstanceRouteRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updateInstanceRoute, hcClient);
    }

    /**
     * 修改ip地址组
     *
     * 修改ip地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpGroupRequest 请求对象
     * @return CompletableFuture<UpdateIpGroupResponse>
     */
    public CompletableFuture<UpdateIpGroupResponse> updateIpGroupAsync(UpdateIpGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateIpGroup);
    }

    /**
     * 修改ip地址组
     *
     * 修改ip地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpGroupRequest 请求对象
     * @return AsyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse>
     */
    public AsyncInvoker<UpdateIpGroupRequest, UpdateIpGroupResponse> updateIpGroupAsyncInvoker(
        UpdateIpGroupRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updateIpGroup, hcClient);
    }

    /**
     * 更新机房IP情报防护规则
     *
     * 更新IP情报防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpReputationRuleRequest 请求对象
     * @return CompletableFuture<UpdateIpReputationRuleResponse>
     */
    public CompletableFuture<UpdateIpReputationRuleResponse> updateIpReputationRuleAsync(
        UpdateIpReputationRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateIpReputationRule);
    }

    /**
     * 更新机房IP情报防护规则
     *
     * 更新IP情报防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpReputationRuleRequest 请求对象
     * @return AsyncInvoker<UpdateIpReputationRuleRequest, UpdateIpReputationRuleResponse>
     */
    public AsyncInvoker<UpdateIpReputationRuleRequest, UpdateIpReputationRuleResponse> updateIpReputationRuleAsyncInvoker(
        UpdateIpReputationRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updateIpReputationRule, hcClient);
    }

    /**
     * 配置全量日志lts
     *
     * 配置全量日志lts，该接口可用来开启与关闭waf全量日志以及配置日志组和日志流。日志组id和日志流id可前往云日志服务获取。配置的日志流id要属于所配置的日志组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLtsInfoConfigRequest 请求对象
     * @return CompletableFuture<UpdateLtsInfoConfigResponse>
     */
    public CompletableFuture<UpdateLtsInfoConfigResponse> updateLtsInfoConfigAsync(UpdateLtsInfoConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateLtsInfoConfig);
    }

    /**
     * 配置全量日志lts
     *
     * 配置全量日志lts，该接口可用来开启与关闭waf全量日志以及配置日志组和日志流。日志组id和日志流id可前往云日志服务获取。配置的日志流id要属于所配置的日志组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLtsInfoConfigRequest 请求对象
     * @return AsyncInvoker<UpdateLtsInfoConfigRequest, UpdateLtsInfoConfigResponse>
     */
    public AsyncInvoker<UpdateLtsInfoConfigRequest, UpdateLtsInfoConfigResponse> updateLtsInfoConfigAsyncInvoker(
        UpdateLtsInfoConfigRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updateLtsInfoConfig, hcClient);
    }

    /**
     * 更新防护策略
     *
     * 更新防护策略，请求体可只传需要更新的部分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return CompletableFuture<UpdatePolicyResponse>
     */
    public CompletableFuture<UpdatePolicyResponse> updatePolicyAsync(UpdatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updatePolicy);
    }

    /**
     * 更新防护策略
     *
     * 更新防护策略，请求体可只传需要更新的部分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>
     */
    public AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicyAsyncInvoker(
        UpdatePolicyRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updatePolicy, hcClient);
    }

    /**
     * 更新防护策略的域名
     *
     * 更新防护策略的防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyProtectHostRequest 请求对象
     * @return CompletableFuture<UpdatePolicyProtectHostResponse>
     */
    public CompletableFuture<UpdatePolicyProtectHostResponse> updatePolicyProtectHostAsync(
        UpdatePolicyProtectHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updatePolicyProtectHost);
    }

    /**
     * 更新防护策略的域名
     *
     * 更新防护策略的防护域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyProtectHostRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse>
     */
    public AsyncInvoker<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse> updatePolicyProtectHostAsyncInvoker(
        UpdatePolicyProtectHostRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updatePolicyProtectHost, hcClient);
    }

    /**
     * 修改单条规则的状态
     *
     * 修改单条规则的状态，用于开启或者关闭单条规则，比如关闭精准防护中某一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRuleStatusRequest 请求对象
     * @return CompletableFuture<UpdatePolicyRuleStatusResponse>
     */
    public CompletableFuture<UpdatePolicyRuleStatusResponse> updatePolicyRuleStatusAsync(
        UpdatePolicyRuleStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updatePolicyRuleStatus);
    }

    /**
     * 修改单条规则的状态
     *
     * 修改单条规则的状态，用于开启或者关闭单条规则，比如关闭精准防护中某一条规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRuleStatusRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse>
     */
    public AsyncInvoker<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse> updatePolicyRuleStatusAsyncInvoker(
        UpdatePolicyRuleStatusRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updatePolicyRuleStatus, hcClient);
    }

    /**
     * 修改独享模式域名配置
     *
     * 修改独享模式域名配置，在没有填入源站信息server的原始数据的情况下，则新的源站信息server会覆盖源站信息，而不是新增源站。此外，请求体可只传需要更新的部分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePremiumHostRequest 请求对象
     * @return CompletableFuture<UpdatePremiumHostResponse>
     */
    public CompletableFuture<UpdatePremiumHostResponse> updatePremiumHostAsync(UpdatePremiumHostRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updatePremiumHost);
    }

    /**
     * 修改独享模式域名配置
     *
     * 修改独享模式域名配置，在没有填入源站信息server的原始数据的情况下，则新的源站信息server会覆盖源站信息，而不是新增源站。此外，请求体可只传需要更新的部分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePremiumHostRequest 请求对象
     * @return AsyncInvoker<UpdatePremiumHostRequest, UpdatePremiumHostResponse>
     */
    public AsyncInvoker<UpdatePremiumHostRequest, UpdatePremiumHostResponse> updatePremiumHostAsyncInvoker(
        UpdatePremiumHostRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updatePremiumHost, hcClient);
    }

    /**
     * 修改独享模式域名接入状态
     *
     * 修改独享模式域名接入状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePremiumHostAccessStatusRequest 请求对象
     * @return CompletableFuture<UpdatePremiumHostAccessStatusResponse>
     */
    public CompletableFuture<UpdatePremiumHostAccessStatusResponse> updatePremiumHostAccessStatusAsync(
        UpdatePremiumHostAccessStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updatePremiumHostAccessStatus);
    }

    /**
     * 修改独享模式域名接入状态
     *
     * 修改独享模式域名接入状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePremiumHostAccessStatusRequest 请求对象
     * @return AsyncInvoker<UpdatePremiumHostAccessStatusRequest, UpdatePremiumHostAccessStatusResponse>
     */
    public AsyncInvoker<UpdatePremiumHostAccessStatusRequest, UpdatePremiumHostAccessStatusResponse> updatePremiumHostAccessStatusAsyncInvoker(
        UpdatePremiumHostAccessStatusRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updatePremiumHostAccessStatus, hcClient);
    }

    /**
     * 修改独享模式域名防护状态
     *
     * 修改独享模式域名防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePremiumHostProtectStatusRequest 请求对象
     * @return CompletableFuture<UpdatePremiumHostProtectStatusResponse>
     */
    public CompletableFuture<UpdatePremiumHostProtectStatusResponse> updatePremiumHostProtectStatusAsync(
        UpdatePremiumHostProtectStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updatePremiumHostProtectStatus);
    }

    /**
     * 修改独享模式域名防护状态
     *
     * 修改独享模式域名防护状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePremiumHostProtectStatusRequest 请求对象
     * @return AsyncInvoker<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse>
     */
    public AsyncInvoker<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> updatePremiumHostProtectStatusAsyncInvoker(
        UpdatePremiumHostProtectStatusRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updatePremiumHostProtectStatus, hcClient);
    }

    /**
     * 操作WAF独享引擎
     *
     * 操作WAF独享引擎
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePremiumInstanceRequest 请求对象
     * @return CompletableFuture<UpdatePremiumInstanceResponse>
     */
    public CompletableFuture<UpdatePremiumInstanceResponse> updatePremiumInstanceAsync(
        UpdatePremiumInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updatePremiumInstance);
    }

    /**
     * 操作WAF独享引擎
     *
     * 操作WAF独享引擎
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePremiumInstanceRequest 请求对象
     * @return AsyncInvoker<UpdatePremiumInstanceRequest, UpdatePremiumInstanceResponse>
     */
    public AsyncInvoker<UpdatePremiumInstanceRequest, UpdatePremiumInstanceResponse> updatePremiumInstanceAsyncInvoker(
        UpdatePremiumInstanceRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updatePremiumInstance, hcClient);
    }

    /**
     * 更新隐私屏蔽防护规则
     *
     * 更新隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivacyRuleRequest 请求对象
     * @return CompletableFuture<UpdatePrivacyRuleResponse>
     */
    public CompletableFuture<UpdatePrivacyRuleResponse> updatePrivacyRuleAsync(UpdatePrivacyRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updatePrivacyRule);
    }

    /**
     * 更新隐私屏蔽防护规则
     *
     * 更新隐私屏蔽防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivacyRuleRequest 请求对象
     * @return AsyncInvoker<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse>
     */
    public AsyncInvoker<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse> updatePrivacyRuleAsyncInvoker(
        UpdatePrivacyRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updatePrivacyRule, hcClient);
    }

    /**
     * 更新攻击惩罚规则
     *
     * 更新攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePunishmentRuleRequest 请求对象
     * @return CompletableFuture<UpdatePunishmentRuleResponse>
     */
    public CompletableFuture<UpdatePunishmentRuleResponse> updatePunishmentRuleAsync(
        UpdatePunishmentRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updatePunishmentRule);
    }

    /**
     * 更新攻击惩罚规则
     *
     * 更新攻击惩罚规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePunishmentRuleRequest 请求对象
     * @return AsyncInvoker<UpdatePunishmentRuleRequest, UpdatePunishmentRuleResponse>
     */
    public AsyncInvoker<UpdatePunishmentRuleRequest, UpdatePunishmentRuleResponse> updatePunishmentRuleAsyncInvoker(
        UpdatePunishmentRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updatePunishmentRule, hcClient);
    }

    /**
     * 修改引用表
     *
     * 修改引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateValueListRequest 请求对象
     * @return CompletableFuture<UpdateValueListResponse>
     */
    public CompletableFuture<UpdateValueListResponse> updateValueListAsync(UpdateValueListRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateValueList);
    }

    /**
     * 修改引用表
     *
     * 修改引用表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateValueListRequest 请求对象
     * @return AsyncInvoker<UpdateValueListRequest, UpdateValueListResponse>
     */
    public AsyncInvoker<UpdateValueListRequest, UpdateValueListResponse> updateValueListAsyncInvoker(
        UpdateValueListRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updateValueList, hcClient);
    }

    /**
     * 更新黑白名单防护规则
     *
     * 更新黑白名单防护规则，可以更新ip/ip段以及防护动作等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWhiteblackipRuleRequest 请求对象
     * @return CompletableFuture<UpdateWhiteblackipRuleResponse>
     */
    public CompletableFuture<UpdateWhiteblackipRuleResponse> updateWhiteblackipRuleAsync(
        UpdateWhiteblackipRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.updateWhiteblackipRule);
    }

    /**
     * 更新黑白名单防护规则
     *
     * 更新黑白名单防护规则，可以更新ip/ip段以及防护动作等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWhiteblackipRuleRequest 请求对象
     * @return AsyncInvoker<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse>
     */
    public AsyncInvoker<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse> updateWhiteblackipRuleAsyncInvoker(
        UpdateWhiteblackipRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.updateWhiteblackipRule, hcClient);
    }

    /**
     * 域名快速接入WAF
     *
     * 快速接入，直接去修改用户的DNS记录，使域名快速接入WAF
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQuickAccessDomainRequest 请求对象
     * @return CompletableFuture<CreateQuickAccessDomainResponse>
     */
    public CompletableFuture<CreateQuickAccessDomainResponse> createQuickAccessDomainAsync(
        CreateQuickAccessDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.createQuickAccessDomain);
    }

    /**
     * 域名快速接入WAF
     *
     * 快速接入，直接去修改用户的DNS记录，使域名快速接入WAF
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateQuickAccessDomainRequest 请求对象
     * @return AsyncInvoker<CreateQuickAccessDomainRequest, CreateQuickAccessDomainResponse>
     */
    public AsyncInvoker<CreateQuickAccessDomainRequest, CreateQuickAccessDomainResponse> createQuickAccessDomainAsyncInvoker(
        CreateQuickAccessDomainRequest request) {
        return new AsyncInvoker<>(request, WafMeta.createQuickAccessDomain, hcClient);
    }

    /**
     * 根据Id查询Web防护规则
     *
     * 根据Id查询Web防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebProtectionRuleRequest 请求对象
     * @return CompletableFuture<ShowWebProtectionRuleResponse>
     */
    public CompletableFuture<ShowWebProtectionRuleResponse> showWebProtectionRuleAsync(
        ShowWebProtectionRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, WafMeta.showWebProtectionRule);
    }

    /**
     * 根据Id查询Web防护规则
     *
     * 根据Id查询Web防护规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebProtectionRuleRequest 请求对象
     * @return AsyncInvoker<ShowWebProtectionRuleRequest, ShowWebProtectionRuleResponse>
     */
    public AsyncInvoker<ShowWebProtectionRuleRequest, ShowWebProtectionRuleResponse> showWebProtectionRuleAsyncInvoker(
        ShowWebProtectionRuleRequest request) {
        return new AsyncInvoker<>(request, WafMeta.showWebProtectionRule, hcClient);
    }

}
