package cordova-plugin-mathcalculator;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class MathCalculator extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if(action.equals("add")) {
            this.add(args, callbackContext);
            return true;
        }else if(action.equals("subtract")){
            this.subtract(args, callbackContext);
            return true;
        }
        return false;
    }

    private void add(JSONArray args, CallbackContext callback){
        if(args != null){
            try {
                int firstValue = Integer.parseInt(args.getJSONObject.getString("Parameter1"));
                int secondValue = Integer.parseInt(args.getJSONObject.getString("Parameter2"));      
                
                callback.success(""+(firstValue+secondValue));
            } catch (Exception e) {
                callback.error("Something Wrong " + e);
            }

        }else{
            callback.error("Error Please do not pass null value");
        }
    }

    private void subtract(JSONArray args, CallbackContext callback){
        if(args != null){
            try {
                int firstValue = Integer.parseInt(args.getJSONObject.getString("Parameter1"));
                int secondValue = Integer.parseInt(args.getJSONObject.getString("Parameter2"));      
                
                callback.success(""+(firstValue-secondValue));
            } catch (Exception e) {
                callback.error("Something Wrong " + e);
            }

        }else{
            callback.error("Error Please do not pass null value");
        }
    }
}
