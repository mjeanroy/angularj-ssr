package ch.swaechter.angularjssr.renderer.engine;

import ch.swaechter.angularjssr.renderer.assets.RenderAssetProvider;
import ch.swaechter.angularjssr.renderer.queue.RenderQueue;

/**
 * The interface RenderEngine represents a JavaScript engine that has to handle all incoming requests, render them and
 * push back the result. Each JavaScript engine has to implement this functionality and can use the given render queue
 * and asset provider to work with.
 *
 * @author Simon Wächter
 */
public interface RenderEngine {

    /**
     * Start the render engine and use the queue to access requests and resolve responses. The provider is used to
     * access the assets.
     *
     * @param queue    Queue that provides the requests and makes it possible to resolve responses
     * @param provider Provider to access the assets
     */
    void doWork(RenderQueue queue, RenderAssetProvider provider);

    /**
     * Finish the current requests and stop the engine.
     */
    void stopWork();

    /**
     * Check if the render engine is working.
     *
     * @return Status if the render engine is working
     */
    boolean isWorking();
}
