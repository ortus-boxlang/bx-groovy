package ortus.boxlang.moduleslug.interceptors;

import ortus.boxlang.runtime.events.BaseInterceptor;
import ortus.boxlang.runtime.events.InterceptionPoint;
import ortus.boxlang.runtime.types.IStruct;

public class ExampleInterceptor extends BaseInterceptor {

	/**
	 * Add your events below with an @interceptionPoint
	 */
	@InterceptionPoint
	public void onApplicationStart( IStruct data ) {
		logger.info( "onApplicationStart" );
	}

}
