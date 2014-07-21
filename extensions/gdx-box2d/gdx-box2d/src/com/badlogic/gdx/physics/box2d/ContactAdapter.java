package com.badlogic.gdx.physics.box2d;

/**
 * An adapter class for {@link ContactListener}. You can derive from this and
 * only override what you are interested in.
 * 
 * @author kajacx
 */

public class ContactAdapter implements ContactListener {

	@Override
	public void beginContact(Contact contact) {
	}

	@Override
	public void endContact(Contact contact) {
	}

	@Override
	public void preSolve(Contact contact, Manifold oldManifold) {
	}

	@Override
	public void postSolve(Contact contact, ContactImpulse impulse) {
	}

}
