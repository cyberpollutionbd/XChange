package com.xeiam.xchange.okcoin;

public class OkCoinUtils {

  public static String getErrorMessage(int errorCode) {

    switch (errorCode) {

    case (10000):
      return "Required field can not be null";
    case (10001):
      return "User request too frequent";
    case (10002):
      return "System error";
    case (10003):
      return "Try again later";
    case (10004):
      return "Not allowed to get resource due to IP constraint";
    case (10005):
      return "secretKey does not exist";
    case (10006):
      return "Partner (API key) does not exist";
    case (10007):
      return "Signature does not match";
    case (10008):
      return "Illegal parameter";
    case (10009):
      return "Order does not exist";
    case (10010):
      return "Insufficient funds";
    case (10011):
      return "Order quantity is less than minimum quantity allowed";
    case (10012):
      return "Invalid currency pair";
    case (10013):
      return "Only support https request";
    case (10014):
      return "Order price can not be ≤ 0 or ≥ 1,000,000";
    case (10015):
      return "Order price differs from current market price too much";
    case (10216):
      return "Non-public API";
<<<<<<< HEAD
    case (20001):
      return "User does not exist";
    case (20002):
      return "Account frozen";
    case (20003):
      return "Account frozen due to liquidation";
    case (20004):
      return "Futures account frozen";
    case (20005):
      return "User futures account does not exist";
    case (20006):
      return "Required field missing";
    case (20007):
      return "Illegal parameter";
    case (20008):
      return "Futures account balance is too low";
    case (20009):
      return "Future contract status error";
    case (20010):
      return "Risk rate ratio does not exist";
    case (20011):
      return "Risk rate higher than 90% before opening position";
    case (20012):
      return "Risk rate higher than 90% after opening position";
    case (20013):
      return "Temporally no counter party price";
    case (20014):
      return "System error";
    case (20015):
      return "Order does not exist";
    case (20016):
      return "Close amount bigger than your open positions";
    case (20017):
      return "Not authorized/illegal operation";
    case (20018):
      return "Order price differ more than 5% from the price in the last minute";
    case (20019):
      return "IP restricted from accessing the resource";
    case (20020):
      return "secretKey does not exist";
    case (20021):
      return "Index information does not exist";
    case (20022):
      return "Wrong API interface (Cross margin mode shall call cross margin API, fixed margin mode shall call fixed margin API)";
    case (20023):
      return "Account in fixed-margin mode";
    case (20024):
      return "Signature does not match";
    case (20025):
      return "Leverage rate error";
    case (20026):
      return "API Permission Error";
    case (20027):
      return "no transaction record";
    case (20028):
      return "no such contract";
=======

    /** Futures error codes */
    case(20001):    
      return "User does not exist";
    case(20002):    
      return "Account frozen";
    case(20003):    
      return "Account frozen due to liquidation";
    case(20004):    
      return "Futures account frozen";
    case(20005):    
      return "User futures account does not exist";
    case(20006):    
      return "Required field missing";
    case(20007):    
      return "Illegal parameter";
    case(20008):    
      return "Futures account balance is too low";
    case(20009):    
      return "Future contract status error";
    case(20010):    
      return "Risk rate ratio does not exist";
    case(20011):    
      return "Risk rate higher than 90% before opening position";
    case(20012):    
      return "Risk rate higher than 90% after opening position";
    case(20013):    
      return "Temporally no counter party price";
    case(20014):    
      return "System error";
    case(20015):    
      return "Order does not exist";
    case(20016):    
      return "Close amount bigger than your open positions";
    case(20017):    
      return "Not authorized/illegal operation";
    case(20018):    
      return "Order price differ more than 5% from the price in the last minute";
    case(20019):    
      return "IP restricted from accessing the resource";
    case(20020):    
      return "secretKey does not exist";
    case(20021):    
      return "Index information does not exist";
    case(20022):    
      return "Wrong API interface (Cross margin mode shall call cross margin API, fixed margin mode shall call fixed margin API)";
    case(20023):    
      return "Account in fixed-margin mode";
    case(20024):    
      return "Signature does not match";
    case(20025):    
      return "Leverage rate error";
    case(20026):    
      return "API Permission Error";
    case(20027):    
      return "no transaction record";
    case(20028):    
      return "no such contract";

>>>>>>> refs/remotes/upstream/develop

    /** Futures error codes */
    case(20001):    
      return "User does not exist";
    case(20002):    
      return "Account frozen";
    case(20003):    
      return "Account frozen due to liquidation";
    case(20004):    
      return "Futures account frozen";
    case(20005):    
      return "User futures account does not exist";
    case(20006):    
      return "Required field missing";
    case(20007):    
      return "Illegal parameter";
    case(20008):    
      return "Futures account balance is too low";
    case(20009):    
      return "Future contract status error";
    case(20010):    
      return "Risk rate ratio does not exist";
    case(20011):    
      return "Risk rate higher than 90% before opening position";
    case(20012):    
      return "Risk rate higher than 90% after opening position";
    case(20013):    
      return "Temporally no counter party price";
    case(20014):    
      return "System error";
    case(20015):    
      return "Order does not exist";
    case(20016):    
      return "Close amount bigger than your open positions";
    case(20017):    
      return "Not authorized/illegal operation";
    case(20018):    
      return "Order price differ more than 5% from the price in the last minute";
    case(20019):    
      return "IP restricted from accessing the resource";
    case(20020):    
      return "secretKey does not exist";
    case(20021):    
      return "Index information does not exist";
    case(20022):    
      return "Wrong API interface (Cross margin mode shall call cross margin API, fixed margin mode shall call fixed margin API)";
    case(20023):    
      return "Account in fixed-margin mode";
    case(20024):    
      return "Signature does not match";
    case(20025):    
      return "Leverage rate error";
    case(20026):    
      return "API Permission Error";
    case(20027):    
      return "no transaction record";
    case(20028):    
      return "no such contract";


    /** Futures error codes */
    case(20001):    
      return "User does not exist";
    case(20002):    
      return "Account frozen";
    case(20003):    
      return "Account frozen due to liquidation";
    case(20004):    
      return "Futures account frozen";
    case(20005):    
      return "User futures account does not exist";
    case(20006):    
      return "Required field missing";
    case(20007):    
      return "Illegal parameter";
    case(20008):    
      return "Futures account balance is too low";
    case(20009):    
      return "Future contract status error";
    case(20010):    
      return "Risk rate ratio does not exist";
    case(20011):    
      return "Risk rate higher than 90% before opening position";
    case(20012):    
      return "Risk rate higher than 90% after opening position";
    case(20013):    
      return "Temporally no counter party price";
    case(20014):    
      return "System error";
    case(20015):    
      return "Order does not exist";
    case(20016):    
      return "Close amount bigger than your open positions";
    case(20017):    
      return "Not authorized/illegal operation";
    case(20018):    
      return "Order price differ more than 5% from the price in the last minute";
    case(20019):    
      return "IP restricted from accessing the resource";
    case(20020):    
      return "secretKey does not exist";
    case(20021):    
      return "Index information does not exist";
    case(20022):    
      return "Wrong API interface (Cross margin mode shall call cross margin API, fixed margin mode shall call fixed margin API)";
    case(20023):    
      return "Account in fixed-margin mode";
    case(20024):    
      return "Signature does not match";
    case(20025):    
      return "Leverage rate error";
    case(20026):    
      return "API Permission Error";
    case(20027):    
      return "no transaction record";
    case(20028):    
      return "no such contract";

    default:
      return "Unknown error";
    }
  }
}
